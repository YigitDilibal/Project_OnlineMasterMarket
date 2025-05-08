package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/E2E.html"},
        tags = "@E2E",
        monochrome = true
)
public class E2E_Runner {

    private static final Logger logger = LogManager.getLogger(TestRunner.class);

    @BeforeClass
    public static void setup(){
        // Test çalışmaya başlamadan önce loglama yapılır
        logger.info("E2E Test Running..");
    }



}
