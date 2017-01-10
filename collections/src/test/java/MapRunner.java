import org.junit.Test;
import org.junit.runners.model.TestClass;

import java.util.Map;

public class MapRunner extends TestClass {
    public MapRunner() {
        super(MapRunner.class);
    }

    @Test
    public void test(){
        MapTrain map = new MapTrain();
        map.getPeople().put("Dima",25);
        System.out.println(map.getPeople());
    }
}
