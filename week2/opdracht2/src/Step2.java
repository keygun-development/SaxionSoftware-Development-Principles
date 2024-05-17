import java.util.Arrays;
import java.util.List;

public class Step2 {
    public static void main(String[] args) {
        List<Person> values = Arrays.asList(new Person("Tom"), new Person("Piet"), new Person("Henk"));

        MyCustomPrinter somePrinter = new MyCustomPrinter();

        values.forEach(somePrinter::doPrint);
    }
}