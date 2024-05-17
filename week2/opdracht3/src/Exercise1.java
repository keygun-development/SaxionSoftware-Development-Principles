import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        new Exercise1().exec();
    }

    public void exec() {
        List<String> list = Arrays.asList("this", "is", "a", "test");

        exercise(list);
    }

    private void exercise(List<String> list) {
        //TODO Count the number of letters for all strings starting with a "t"
        //     using a 'normal' for loop
        int total = 0;
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i).startsWith("t")) {
                total++;
            }
        }
        System.out.println(total);
    }

}