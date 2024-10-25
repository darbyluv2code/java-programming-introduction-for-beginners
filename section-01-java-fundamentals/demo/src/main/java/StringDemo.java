public class StringDemo {

    public static void main(String[] args) {

        /*
        var message = "Hello World!";
        var extra = "I love to code!";
        */

        String message = "Hello World!";
        String extra = "I love to code!";

        System.out.println(message + " " + extra);

        System.out.println("Length of " + message + " is " + message.length());
        System.out.println("Upper case version of " + message + " is " + message.toUpperCase());
        System.out.println("Lower case version of " + message + " is " + message.toLowerCase());

        String combo = message + " " + extra;
        System.out.println("Combo: " + combo);

        String upperVersion = combo.toUpperCase();
        System.out.println("Upper version: " + upperVersion);

    }
}













