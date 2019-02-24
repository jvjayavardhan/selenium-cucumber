package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import hooks.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {
		"@demoTag" }, features = "src/main/resources/features", glue = {
				"stepDefinitions" })

public class Runner {
	@BeforeClass
    public static void beforeClass() {
		Hooks.init();
    }
}