package runner;

@CucumberOptions(
features = "E:\\javaselenium\\DemoWebShopMaven\\src\\test\\java\\features" // path of feature file
,glue={"StepDefinitions"}  //path of step definition class
,tags={"@Registration"} //to run exactly which is required

 

,monochrome=true// console output is much more readable
,plugin = {"json:target/cucumber.json"} // to generate reports

 


)

 

public class TestrunnerwithtestNQ extends AbstractTestNGCucumberTests{

 

}


