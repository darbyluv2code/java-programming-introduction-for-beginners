package exceptionhandling.three;

public class Main {
    /* Finally Block */

    public static void main(String[] args) {

        parseString(null); //Then pass in null
    }

    public static void parseString(String numberString) {
        try {
            System.out.println(numberString.length());
            int numberInt = Integer.parseInt(numberString);
            System.out.println(numberInt);
        }
        catch (NumberFormatException | NullPointerException e) {
            System.out.println("String needs to be a valid int");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            // Will always run no matter what
            System.out.println("In the finally block!");
        }
        System.out.println("-- The rest of the app -- ");
    }
}
