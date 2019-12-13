package framework;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

public class Core {

    private static Core ourInstance = null;
    public static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static final Map<String, PageScreen> PageScreens = new HashMap<>();
    String filePath = System.getProperty("user.dir") + "/src/test/resources/PageObjects/";
    public static ExtentReports report = null;
    public static ExtentTest logger = null;

    private Core(DesiredCapabilities... params) throws Throwable {
        setDriver(params);
        PageScreens.putAll(getAllPages(filePath));
    }

    public static Core getInstance() throws Throwable {
        if (ourInstance == null) {
            ourInstance = new Core();
            System.out.println("**********************Session id created********************** new session id : " + ((RemoteWebDriver) driver.get()).getSessionId());
        }
        if (ourInstance != null && ((RemoteWebDriver) driver.get()).getSessionId() == null) {
            ourInstance = new Core();
            System.out.println("**********************Session id killed and new session created********************** new session id : " + ((RemoteWebDriver) driver.get()).getSessionId());
        }
        return ourInstance;
    }

    private void setDriver(DesiredCapabilities... params) throws IOException {
        driver.set(getDriverThreadLocal(params).get());
    }

    private static ThreadLocal<WebDriver> getDriverThreadLocal(DesiredCapabilities... params) throws IOException {
        final Properties prop = new Properties();
        FileInputStream input = new FileInputStream("src/test/resources/config.properties");
        prop.load(input);
        return new ThreadLocal<WebDriver>() {
            @Override
            protected WebDriver initialValue() {
                WebDriver driver = null;
                try {
                    if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                        System.setProperty("webdriver.chrome.driver", prop.getProperty("pathOfChrome"));
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return driver;
            }
        };
    }

    private static Map<String, PageScreen> getAllPages(String filePath) throws Throwable {
        Map<String, PageScreen> pages = new HashMap<>();
        try {
            Iterator it = FileUtils.iterateFiles(new File(filePath), new String[]{"yaml"}, false);
            while (it.hasNext()) {
                File file = (File) it.next();
                PageScreen pageScreen = getPage(file);
                //System.out.println("Name of the file : " + file.getName());
                // System.out.println("****** :- " + pageScreen.getPageName());
                // System.out.println(ReflectionToStringBuilder.toString(pageScreen, ToStringStyle.MULTI_LINE_STYLE));
                pages.put(pageScreen.getPageName(), pageScreen);
            }
            System.out.println("All Page Object created and stored in Map : PageScreens");
        } catch (Exception e) {
            e.printStackTrace();
            throw e.getCause();
        }
        return pages;
    }

    private static PageScreen getPage(File file) throws Throwable {
        PageScreen pageScreen;
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
            pageScreen = mapper.readValue(file, PageScreen.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw e.getCause();
        }
        return pageScreen;
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver() {
        if (getDriver() != null) {
            try {
                getDriver().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                getDriver().quit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.remove();
    }

    private static Boolean isSessionEmpty() {
        Boolean isEmpty = false;
        SessionId session = ((RemoteWebDriver) driver.get()).getSessionId();
        if (session == null) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        return isEmpty;
    }


}
