package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import factoryPattern.ShapeFactory;
import factoryPattern.objects.Shape;
import factoryPattern.objects.Square;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BasicSteps {

    @Autowired
    private ShapeFactory shapeFactory = new ShapeFactory();

    @Given("^the following animals:$")
    public void theFollowingAnimals(List<String> animals) {
        Assert.assertNotEquals(animals.size(), 0);

        animals.forEach(System.out::println);
    }

    @Given("^there is (?:a|an other) default '(.*)' shape$")
    public void shapeCreator(String shapeName) {
        shapeFactory.getShape(shapeName);
    }

    @Given("^there is a square with length: (.*)$")
    public void squareWithLength(Double length){
        Square square = (Square) shapeFactory.getShape("Square");
        square.withLength(length).draw();
    }
}