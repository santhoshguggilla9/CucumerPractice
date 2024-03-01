package suaceDemoStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/DemoSauce.feature",
		glue={"suaceDemoStepDef"},
		plugin = { "pretty", "html:target/report.html"},
		monochrome = false,
		tags = "@smoketest"
		
		)
public class SauceDeemoRunner {

}
