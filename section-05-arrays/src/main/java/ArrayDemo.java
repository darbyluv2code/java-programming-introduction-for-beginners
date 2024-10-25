public class ArrayDemo {

    public static void main(String[] args) {

        // initialize the array
        String[] colors = { "Red", "Green", "Blue", "Yellow" };

        // display contents of the array
        System.out.println("Contents of the array:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        System.out.println();

        // display length of the array
        System.out.println("Length of the array: " + colors.length);

        System.out.println();

        // loop through the array - version 1
        System.out.println("Looping through the array - Version 1:");

        for (int i=0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();

        // loop through the array - version 2
        System.out.println("Looping through the array - Version 2:");

        for (String temp : colors) {
            System.out.println(temp);
        }
    }
}









