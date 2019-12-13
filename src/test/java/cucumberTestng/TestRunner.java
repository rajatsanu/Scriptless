package cucumberTestng;

import com.relevantcodes.extentreports.ExtentReports;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework.Core;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(features = "src/test/resources/features", format = { "pretty",
        "html:target/site/cucumber-pretty",
        //"rerun:target/rerun.txt",
        "json:target/cucumber1.json" },
        glue = {"stepDefination","customStepDefination"},
        tags = {"@rajat","~@ignore"},
        dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void loadPageObjects() throws Throwable {
        System.out.println(" ########### BEFORE CLASS ########### ");
        Core.getInstance();
        Core.report = new ExtentReports("target\\report.html",true);
    }

    @AfterClass
    public static void end(){
        System.out.println(" ########### AFTER CLASS ########### ");
        Core.report.flush();
        Core.closeDriver();
    }
}