package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\suman\\eclipse-workspace\\OrangeHRMCucumber\\FeatureFile\\AdminModul.feature",
	    glue = {"StepDefinition","hooks"},
	    dryRun = !true,
	    tags = ("@addjob"),
	    plugin = {
	        "pretty",                             
	        "html:target/cucumber-reports.html",   
	        "json:target/cucumber-reports.json",   
	        "junit:target/cucumber-reports.xml"    
	    }
	                            
		)
public class RunnerClass {
	
	//https://github.com/himachalam-96550/CucumberProjectOrangeHrm.git

}
