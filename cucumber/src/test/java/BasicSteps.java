import cucumber.api.java.en.Given;
import org.junit.Assert;

import java.util.List;

public class BasicSteps {

    @Given("^the following animals:$")
    public void theFollowingAnimals(List<String> animals) {

        Assert.assertNotEquals(animals.size(), 0);

        animals.forEach(System.out::println);

    }

}