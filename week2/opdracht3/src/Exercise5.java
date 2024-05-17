import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        new Exercise5().exec();
    }

    public void exec() {
        List<String> list = Arrays.asList("this", "is", "a", "test");

        exercise(list);
    }

    private void exercise(List<String> list) {
        //TODO What is the average number of letters used in the words
        //     Hint: use .mapToInt or .collect
        System.out.println(
                list.stream()
                        .mapToInt(String::length)
                        .average()
                        .getAsDouble()
        );
    }
}
