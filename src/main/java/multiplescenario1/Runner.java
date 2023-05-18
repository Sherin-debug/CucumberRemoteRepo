package multiplescenario1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="/Users/SH20450663/eclipse-workspace/Cucumber/src/main/java/multiplescenario1/second.feature",
	glue= {"multiplescenario1"}
			)



	public class Runner {

	}
	


