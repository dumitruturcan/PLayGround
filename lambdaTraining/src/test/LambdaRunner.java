import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestClass;

import java.util.*;


public class LambdaRunner extends TestClass {
    public LambdaRunner() {
        super(LambdaRunner.class);
    }

    @Before
    public void before() {
        System.out.println("---------------------------------------TEST STARTED---------------------------------------");
    }

    @Test
    public void test() {
        List<Person> people = Arrays.asList(
                new Person("Dumitru", "Turcan", 20),
                new Person("Sergiu", "Shatkovskii", 21),
                new Person("Anastasia", "Turcan", 20),
                new Person("Natalia", "Shestakovskaia", 19)
        );

        Collections.sort(people, (person1, person2) -> person2.getLastName().compareTo(person1.getLastName()));
        System.out.println("SORTED LIST:");
        printPeopleThatMathcCondition(people, p -> true);
        System.out.println("STARTING WITH 'T' ");
        printPeopleThatMathcCondition(people, p -> p.getLastName().startsWith("T"));
        System.out.println("STARTING WITH 'A' ");
        printPeopleThatMathcCondition(people, p -> p.getFirstName().startsWith("A"));
    }

    @After
    public void after() {
        System.out.println("---------------------------------------TEST STOPPED---------------------------------------");
    }

    private void printPeopleThatMathcCondition(List<Person> people, MyCondition condition) {
        for (Person person : people)
            if (condition.test(person)) System.out.println(person.toString());
    }
}
