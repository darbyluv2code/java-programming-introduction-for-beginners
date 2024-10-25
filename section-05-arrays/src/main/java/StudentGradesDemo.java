import java.util.Scanner;

public class StudentGradesDemo {

    public static void main(String[] args) {

        /*
        // initialize the array
        double[] grades = new double[3];

        // assign student grades
        grades[0] = 100.0;
        grades[1] = 76.7;
        grades[2] = 89.0;

        // display the grades
        for (double temp : grades) {
            System.out.println(temp);
        }
        */

        // prompt the user for how many grades
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades will you enter? ");
        int numGrades = scanner.nextInt();

        System.out.println();

        // initialize the array based on the number of grades
        double[] userInputGrades = new double[numGrades];

        // read each grade and assign to an array element
        for (int i=0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number " + (i+1) + ": ");
            userInputGrades[i] = scanner.nextDouble();
        }

        System.out.println();

        // print out the array elements
        for (double temp : userInputGrades) {
            System.out.println(temp);
        }

        scanner.close();

    }
}











