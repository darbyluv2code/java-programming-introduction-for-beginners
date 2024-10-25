public class BreakAndContinueDemo {

    public static void main(String[] args) {

        // example using break
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println("Counter: " + i);
        }

        System.out.println();

        // example using continue
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println("Counter: " + i);
        }
    }
}








