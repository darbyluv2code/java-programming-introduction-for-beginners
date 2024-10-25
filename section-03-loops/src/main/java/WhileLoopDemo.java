import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean done = false;

        /*
        while (!done) {

            System.out.println("Hello world");

            System.out.print("Are we done? Y/N: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                done = true;
            }

            System.out.println();
        }
         */

        do {

            System.out.println("Hello world");

            System.out.print("Are we done? Y/N: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                done = true;
            }

            System.out.println();
        } while (!done);




        scanner.close();
    }
}
