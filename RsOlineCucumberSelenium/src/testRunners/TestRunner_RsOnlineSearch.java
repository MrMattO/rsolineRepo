package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/resources/RSOnlineSearching.feature", 
		glue="stepDefns"
		)
public class TestRunner_RsOnlineSearch {

	
}
