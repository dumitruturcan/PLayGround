import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = {"src/test/resources"},
        tags = {"@Run"})
public class RunCukeTest {
}
