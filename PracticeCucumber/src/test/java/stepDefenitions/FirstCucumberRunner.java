package stepDefenitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/FirstCucumber.feature",
		glue={"stepDefenitions"},
		plugin = { "pretty", "html:target/report.html"},
		monochrome = false
		)
public class FirstCucumberRunner {

}
