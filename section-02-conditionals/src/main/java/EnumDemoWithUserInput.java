import java.util.Scanner;

public class EnumDemoWithUserInput {

    public static void main(String[] args) {

        ComputerType myComputerType = null;

        Scanner scanner = new Scanner(System.in);

        // prompt the user
        System.out.print("Enter computer type (SMARTPHONE, TABLET, LAPTOP, DESKTOP): ");
        String userInput = scanner.nextLine().trim().toUpperCase();

        // convert string to enum
        try {
            myComputerType = ComputerType.valueOf(userInput);
            System.out.println("You selected: " + myComputerType);
        }
        catch (IllegalArgumentException exc) {
            System.out.println("Invalid computer type entered: " + userInput);
            System.exit(1);
        }
        finally {
            scanner.close();
        }

        String description = switch (myComputerType) {
            case ComputerType.SMARTPHONE -> "Smart phones offer computing power in your hand.";
            case ComputerType.TABLET -> "Tablets are lightweight for browing and light tasks.";
            case ComputerType.LAPTOP -> "Laptops are portable for work on the go.";
            case ComputerType.DESKTOP -> "Desktops excel in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };

        System.out.println(description);
    }
}
