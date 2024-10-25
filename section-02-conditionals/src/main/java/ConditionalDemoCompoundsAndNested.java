import java.util.Scanner;

public class ConditionalDemoCompoundsAndNested {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minClassCount = 2;
        int maxClassCount = 5;

        System.out.print("Enter your class count: ");
        int userCount = scanner.nextInt();

        System.out.println("userCount=" + userCount);
        System.out.println("minClassCount=" + minClassCount);
        System.out.println("maxClassCount=" + maxClassCount);
        System.out.println();

        if (userCount >= minClassCount && userCount <= maxClassCount) {
            System.out.println("Your class count is in the recommended range");

            // check if userCount is even or odd
            if ((userCount % 2) == 0) {
                System.out.println("You have selected an even number of classes.");
            } else {
                System.out.println("You have selected an odd number of classes.");
            }

        } else {
            System.out.println("Your class count is outside of the recommended range");
        }

        scanner.close();
    }
}










