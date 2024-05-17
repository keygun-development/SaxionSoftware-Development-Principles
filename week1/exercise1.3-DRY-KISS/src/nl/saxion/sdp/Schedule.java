public class Schedule extends Birthdate {
    private final String task;
    private final Person forPerson;

    public Schedule(int day, int month, int year, String task, Person person) {
        super(day, month, year);
        this.task = task;
        this.forPerson = person;
    }


    @Override
    public String toString() {
        return "on " + forPerson.birthdate.getDay() + "of " + forPerson.birthdate.getMonth(forPerson.birthdate.getMonthInt()) + " " + forPerson.birthdate.getYear() + " we are doing " + task;
    }
}
