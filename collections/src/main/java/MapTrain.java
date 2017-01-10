import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTrain {

    private Map<String,Integer> people = new ConcurrentHashMap<String, Integer>();

    public MapTrain(){
        people.put("Dima",20);
        people.put("Nastea",20);
        people.put("Nadea",19);
    }

    public Map<String, Integer> getPeople() {
        return people;
    }

    public void setPeople(Map<String, Integer> people) {
        this.people = people;
    }
}
