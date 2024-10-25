import java.util.Scanner;

public class SwitchComputerType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your computer type: ");
        String computerType = scanner.nextLine();

        // convert the input to lower case
        computerType = computerType.toLowerCase();

        switch (computerType) {
            case "smartphone":
                System.out.println("Smartphones offer computing power in your hand.");
                break;
            case "tablet":
                System.out.println("Tablets are lightweight for browsing and light tasks.");
                break;
            case "laptop":
                System.out.println("Laptops are portable for work on the go.");
                break;
            case "desktop":
                System.out.println("Desktops excel in gaming and work related tasks.");
                break;
            default:
                System.out.println("Unknown computer type.");
        }

        scanner.close();
    }
}
