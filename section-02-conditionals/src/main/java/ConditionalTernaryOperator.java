import java.util.Scanner;

public class ConditionalTernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minVotingAge = 18;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Minimum voting age: " + minVotingAge);

        String message = (age >= minVotingAge) ? "You are eligible to vote." : "You are NOT eligible to vote";
        System.out.println(message);

        scanner.close();
    }
}
