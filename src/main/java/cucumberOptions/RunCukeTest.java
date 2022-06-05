package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "stepdefinition",
        plugin = {"pretty","json:target/cucumber.json"},
        tags = "@TC_01 or @TC_02 or @TC_03 or @TC_04 or @TC_05 or @TC_06"
        //tags = "@TC_02"
)
public class RunCukeTest {
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass(alwaysRun = true)
    public void setupClass(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(groups = "cucumber",dataProvider = "scenarios")
    public void runScenarios(PickleWrapper picke, FeatureWrapper cucumberFeature){
        testNGCucumberRunner.runScenario(picke.getPickle());
    }
    @DataProvider
    public Object[][] scenarios(){
        return testNGCucumberRunner.provideScenarios();
    }
    @AfterClass(alwaysRun = true)
    public void tearDownClass(){
        testNGCucumberRunner.finish();
    }
}
