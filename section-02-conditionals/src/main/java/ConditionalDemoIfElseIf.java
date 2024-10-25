import java.util.Scanner;

public class ConditionalDemoIfElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score on the exam: ");
        double scoreOnExam = scanner.nextDouble();

        double firstTierScoreMin = 90.0;
        double secondTierScoreMin = 80.0;

        if (scoreOnExam >= firstTierScoreMin) {
            System.out.println("You scored in the first tier.");
        } else if (scoreOnExam >= secondTierScoreMin) {
            System.out.println("You scored in the second tier.");
        } else {
            System.out.println("Low grade. You did not score in the top two tiers.");
        }

        scanner.close();
    }
}









