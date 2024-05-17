import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        new Exercise2().exec();
    }

    public void exec() {
        List<String> list = Arrays.asList("this", "is", "a", "test");

        exercise(list);
    }

    private void exercise(List<String> list) {
        //TODO Count the number of letters for all strings starting with a "t"
        //     using a stream (map followed by reduce).
        //     Do not use the method operator (::)
        System.out.println(
                list.stream()
                        .filter(s -> s.startsWith("t"))
                        .map(s -> s.length())
                        .reduce(0, (a, b) -> a + b)
        );
    }
}
