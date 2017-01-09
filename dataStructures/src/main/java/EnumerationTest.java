import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

    private Enumeration days;
    private Vector<String> dayNames;

    public EnumerationTest() {
        dayNames = new Vector<String>();
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add("Sunday");

        days = dayNames.elements();
    }

    public Enumeration getDays() {
        return days;
    }

    public void setDays(Enumeration days) {
        this.days = days;
    }

    public Vector<String> getDayNames() {
        return dayNames;
    }

    public void setDayNames(Vector<String> vector) {
        this.dayNames = vector;
    }
}
