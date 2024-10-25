import java.util.Scanner;

public class StringInputDemo {

    public static void main(String[] args) {

        // Create a scanner for reading input from the user
        Scanner scanner = new Scanner(System.in);

        // prompt the user
        System.out.print("What is your favorite color? ");

        // read the input from the user
        String theColor = scanner.nextLine();

        // prompt the user
        System.out.print("What is your hobby? ");

        // read the input from the user
        String theHobby = scanner.nextLine();

        System.out.println("Your favorite color is " + theColor);
        System.out.println("Your hobby is " + theHobby);

        // close to release resources and prevent resource/memory leaks
        scanner.close();
    }
}











