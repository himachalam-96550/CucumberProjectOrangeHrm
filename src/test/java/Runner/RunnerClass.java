package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "FeatureFile/AdminModul.feature",
	    glue = {"StepDefinition","hooks"},
	    dryRun = !true,
	   // tags = ("@add"),
	    plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
	    		                        
		)
public class RunnerClass {
	
	//https://github.com/himachalam-96550/CucumberProjectOrangeHrm.git
    // FeatureFile/PimModul.feature
	
	//To Start Server. Generate and open Report
	//allure serve allure-results

	//To Generate Single Html Report
	//allure generate --single-file allure-results --clean
}
