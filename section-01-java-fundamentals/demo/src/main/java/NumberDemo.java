public class NumberDemo {

    public static void main(String[] args) {

        double gradeExam1 = 87.5;
        double gradeExam2 = 100.0;
        double gradeExam3 = 66.50;

        double gradeAverage = (gradeExam1 + gradeExam2 + gradeExam3) / 3;

        System.out.println("Grade exam 1: " + gradeExam1);
        System.out.println("Grade exam 2: " + gradeExam2);
        System.out.println("Grade exam 3: " + gradeExam3);
        System.out.println("Grade average: " + gradeAverage);

        // format the output
        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("Formatted average: " + formattedAvg);

    }
}








