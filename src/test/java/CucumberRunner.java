import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"ru.arkhipov.basetest"},
        plugin = {
            "ru.arkhipov.basetest.util.AllureReporter",
        }
)
public class CucumberRunner {

}
