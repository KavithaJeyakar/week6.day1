package runnerMain;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/featuresMain",
glue="stepsMain",
monochrome= true,
publish = true)

public class CucumberRunner extends AbstractTestNGCucumberTests
{
	
}
