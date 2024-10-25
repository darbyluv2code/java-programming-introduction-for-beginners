public class RecursionDemo {

    public static void main(String[] args) {

        int val = 5;
        int result = factorial(val);
        System.out.println("Factorial of " + val + " is " + result);
    }

    // define method
    static int factorial(int num) {

        // base case: 0! = 1
        if (num == 0) {
            return 1;
        }
        else {
            // recursive case: num! = num * (num-1)!
            return num * factorial(num - 1);
        }

    }
}
