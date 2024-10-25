public class CastingDemo {

    public static void main(String[] args) {

        // convert double to int
        double theDoubleGradeAvg = 89.70;
        int theIntGradeAvg = (int) theDoubleGradeAvg;

        System.out.println("theDoubleGradeAvg=" + theDoubleGradeAvg);
        System.out.println("theIntGradeAvg=" + theIntGradeAvg);

        // convert float to byte
        float theFloatDistance = 123.60f;
        byte theByteDistance = (byte) theFloatDistance;

        System.out.println("theFloatDistance=" + theFloatDistance);
        System.out.println("theByteDistance=" + theByteDistance);

        // convert int to char
        int theCharacterCode = 65;
        char theChar = (char) theCharacterCode;

        System.out.println("theCharacterCode=" + theCharacterCode);
        System.out.println("theChar=" + theChar);

        // convert String to int
        int count = Integer.parseInt("49");
        System.out.println("count=" + count);
    }
}










