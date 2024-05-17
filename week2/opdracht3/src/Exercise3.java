import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        new Exercise3().exec();
    }

    public void exec() {
        List<String> list = Arrays.asList("this", "is", "a", "test");

        exercise(list);
    }

    private void exercise(List<String> list) {
        //TODO Count the number of letters for all strings starting with a "t"
        //     using a stream (map followed by reduce).
        //     Use the method operator (::) for the map and reduce
        //     Hint: Look at the sum() method implemented in the Integer class.
        System.out.println(
                list.stream()
                        .filter(s -> s.startsWith("t"))
                        .map(String::length)
                        .reduce(0, Integer::sum)
        );
    }
}
