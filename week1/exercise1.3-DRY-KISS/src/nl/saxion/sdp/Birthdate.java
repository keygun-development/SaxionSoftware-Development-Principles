import java.util.ArrayList;

public class Birthdate {

    private final int day;
    private final int month;
    private final int year;

    public Birthdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonthInt() {
        return month;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "born on the " + day + " of " + getMonth(month) + " " + year;
    }


    String getMonth(int month) {
        ArrayList<String> months = new ArrayList<>();

        if (month < 1 || month > 12) {
            throw new RuntimeException("month must be in range 1 to 12");
        }

        return months.get(month - 1);
    }
}
