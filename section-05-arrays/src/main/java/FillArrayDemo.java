import java.util.Arrays;
import java.util.Scanner;

public class FillArrayDemo {

    public static void main(String[] args) {

        // prompt the user for size of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int size = scanner.nextInt();

        System.out.print("What number do you want to fill the array with? ");
        int theNum = scanner.nextInt();

        // initialize the array
        int[] myDataArray = new int[size];

        // fill the array
        Arrays.fill(myDataArray, theNum);

        System.out.println();

        // display the contents of the array
        for (int temp : myDataArray) {
            System.out.println(temp);
        }

        scanner.close();
    }

}






