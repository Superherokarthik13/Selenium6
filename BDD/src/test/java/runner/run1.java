package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue="steps",tags="@Sc1")
public class run1 {

	
	 //for testng do not use @runWith(junit)
	//public class run1 extends AbstractTestNGCucumberTests{ (for Testng)
	
}
