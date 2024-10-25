package lambdas.four;

public class Main {
    public static void main(String[] args) {
        Calculate divide = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                return -1;
            }
        };

        int solution = divide.perform(10, 0);

        System.out.println(solution);
    }
}

@FunctionalInterface
interface Calculate {
    int perform(int a, int b);
}
