import java.time.*;
public class Day_Of_The_Year {
    public int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);  // format must be yyyy-MM-dd
        return d.getDayOfYear();
    }
}
