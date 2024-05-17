import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        new Exercise4().exec();
    }

    public void exec() {
        List<String> list = Arrays.asList("this", "is", "a", "test");

        exercise(list);
    }

    private void exercise(List<String> list) {
        //TODO Count all words with an even number of letters
        System.out.println(
                list.stream()
                        .filter(s -> s.length() % 2 == 0)
                        .count()
        );
    }
}
