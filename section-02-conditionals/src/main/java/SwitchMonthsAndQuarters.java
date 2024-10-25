import java.util.Scanner;

public class SwitchMonthsAndQuarters {

    public static void main(String[] args) {

        // Months are 1-based: January = 1, February = 2, etc ...

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int theMonth = scanner.nextInt();

        System.out.println("Month: " + theMonth);

        switch (theMonth) {
            case 1:
            case 2:
            case 3:
                System.out.println("Q1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Q2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Q3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Q4");
                break;
            default:
                System.out.println("Invalid month.");
        }

        scanner.close();
    }
}











