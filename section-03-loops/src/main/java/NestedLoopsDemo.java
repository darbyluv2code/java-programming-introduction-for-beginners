public class NestedLoopsDemo {

    public static void main(String[] args) {

        // 5x5 multiplication table
        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <= 5; col++) {
                int value = row * col;
                System.out.print(value + "\t");
            }
            System.out.println();

        }
    }
}
