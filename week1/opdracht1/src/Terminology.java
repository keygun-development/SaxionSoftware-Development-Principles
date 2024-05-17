import java.util.Random;
import java.util.Scanner;

public class Terminology {

    String answer;
    int age;

    public static void main(String[] args) {
        Terminology terminology = new Terminology();
        terminology.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your name");
        answer = scanner.nextLine();
        System.out.println("Answer");
        System.out.println("Give your age");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are allowed to vote");
        } else {
            int waitToVote = 18 - age;
            System.out.println("You will have to wait" + waitToVote + " years to vote");
            String country = getCountryByIp();
            if (age >= 16 && age < 18 && getCountryByIp().equals("USA")) { // <----------- This line!!!
                System.out.println("But you are allowed to drive a car");
            } else {
                System.out.println("Alas are not yet allowed o drive a car in " + country);
            }
        }
    }

    /**
     * Mock functions to get the country based on the IP address
     *
     * @return the country based on the current IP address
     */
    public String getCountryByIp() {
        String[] countries = {"USA", "NL", "DE", "Uk", "TR", "MA"};
        int selected = new Random().nextInt(6);
        return countries[selected];
    }

}