import java.util.Arrays;
import java.util.List;

public class Step1 {

    public static void main(String[] args) {
        List<Person> values = Arrays.asList(new Person("Tom"), new Person("Jack"), new Person("Jill"));

        values.forEach(Step1::customPrint);
    }

    public static void customPrint(Person p) {
        System.out.println(p.getName());
    }
}