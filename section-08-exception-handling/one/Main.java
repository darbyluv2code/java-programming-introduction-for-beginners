package exceptionhandling.two;

public class Main {
    public static void main(String[] args) {
        /* Put in a function
         * Add new exception handling for NumberFormatException
         * Add null (new error)
         * Add multi-catch
         * */
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
        System.out.println("-- The rest of the app -- ");
    }
}
