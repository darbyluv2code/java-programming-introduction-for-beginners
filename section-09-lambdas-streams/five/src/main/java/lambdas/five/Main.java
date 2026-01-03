package lambdas.five;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> countVowelsFunction = Vowels::countVowels;
        System.out.println(countVowelsFunction.apply("umbrella"));
    }
}
