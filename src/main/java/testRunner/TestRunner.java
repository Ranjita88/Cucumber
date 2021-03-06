package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinations" },

		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" })
public class TestRunner {

	@AfterClass
	public static void writeReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
	}
}
