import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayDemo {

    public static void main(String[] args) {

        // prompt the user for size of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int size = scanner.nextInt();

        // initialize the array
        int[] myDataArray = new int[size];

        // read each number and assign it to an array
        for (int i=0; i < myDataArray.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            myDataArray[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.print("What number do you want to search for? ");
        int searchKey = scanner.nextInt();

        System.out.println();

        // sort array first
        Arrays.sort(myDataArray);

        // search the array
        int result = Arrays.binarySearch(myDataArray, searchKey);

        boolean found = (result >= 0);

        System.out.println("Found: " + found);

        if (found) {
            System.out.println("We found the number: " + searchKey);
        }
        else {
            System.out.println("We did not find the number: " + searchKey);
        }

        scanner.close();
    }

}






