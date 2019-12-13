package customStepDefination;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.Core;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CustomeStepDefination1 {

    @Before
    public void startTest(Scenario scenario){
        System.out.println("----------Before----------");
        Core.logger = Core.report.startTest(scenario.getName());
    }


    @After
    public void endTest(Scenario scenario){
        System.out.println("----------After----------");
        Core.report.endTest(Core.logger);
        String scrFile = ((TakesScreenshot) Core.getDriver()).getScreenshotAs(OutputType.BASE64);
        Core.logger.addBase64ScreenShot(scrFile);
    }
}
