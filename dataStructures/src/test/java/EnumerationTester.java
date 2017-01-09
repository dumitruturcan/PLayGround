import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestClass;

public class EnumerationTester extends TestClass {
    public EnumerationTester() {
        super(EnumerationTester.class);
    }

    @Before
    public void before(){
        System.out.println("------------------Start Enumeration Test------------------");
    }

    @Test
    public void test(){

        EnumerationTest enumerationTest= new EnumerationTest();

        while (enumerationTest.getDays().hasMoreElements())
            System.out.println(enumerationTest.getDays().nextElement());

    }

    @After
    public void after(){
        System.out.println("------------------End of Enumeration Test------------------");
    }

}
