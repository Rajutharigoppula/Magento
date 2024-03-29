package StepDefinition;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefiles\\Order.feature",tags= {"@smoketest"},monochrome = true, 
plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})

//plugin = {"pretty","html:target"})

public class Runnerclass 
{
	@AfterClass
	public static void setup()
	{
		
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Raju");
	Reporter.setSystemInfo("Application Name", "MagentoAdmin");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

	}
}
