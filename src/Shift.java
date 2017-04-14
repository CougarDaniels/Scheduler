import java.time.DayOfWeek;

/**
 * Created by Ted on 8/13/2016.
 */
public class Shift {

    private DayOfWeek day;
    private Time time;

    public Shift(int value) {
        this.day = DayOfWeek.of(value);
        System.out.println(day.toString());

    }

}
