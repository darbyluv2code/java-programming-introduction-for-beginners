public class CompareStrings {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        boolean result1 = (s1 == s2);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1 == s2: " + result1);
        System.out.println();

        String s3 = new String("Hello");
        boolean result3 = (s1 == s3);

        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println("s1 == s3: " + result3);
        System.out.println();

        System.out.println("s3: " + s3);
        result3 = s1.equals(s3);
        System.out.println("s1.equals(s3): " + result3);
        System.out.println();

        String s4 = new String("hello");
        System.out.println("s4: " + s4);
        boolean result4 = s4.equalsIgnoreCase(s3);
        System.out.println("s4.equalsIgnoreCase(s3): " + result4);
    }
}








