public class Exercise6 {
    public static void main(String[] args) {
        if (countLetters("Hello World") != 10) {
            throw new RuntimeException("Function not correctly implemented");
        }
    }

    public static int countLetters(String input) {
        //todo: Implement the functionality using streams.
        return input
                .chars()
                .filter(Character::isLetter)
                .map(c -> 1)
                .sum();
    }
}
