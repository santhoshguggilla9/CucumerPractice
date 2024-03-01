package nopCommerceDemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/NopCommerce.feature",
		glue= {"nopCommerceDemo"},
		plugin = { "pretty", "html:target/report.html"},
		monochrome = false
	)

public class NopCommerceRunner {

}
