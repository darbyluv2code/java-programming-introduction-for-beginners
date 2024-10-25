package lambdas.three;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        StringEndings exclamationMark = (s) -> s + "!";
        System.out.println(exclamationMark.perform("Hello"));

        String a = "Milo";
        String b = "Tester";

        StringCompare value = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            }
            return s2;
        };

        String longerWord = value.perform(a , b);
        System.out.println(longerWord);

// NEW HERE:

Predicate<Integer> lessThan100 = i -> (i<100);
Predicate<Integer> greaterThan50 = i -> (i>50);

boolean result = lessThan100.test(55);
System.out.println(result);

// and()
boolean result = lessThan100.and(greaterThan50).test(55);
System.out.println(result); //true

// or()
boolean result = lessThan100.or(greaterThan50).test(3);
System.out.println(result); //true

// negate()
boolean result = lessThan100.negate().test(3);
System.out.println(result); //false

}


@FunctionalInterface
interface StringEndings {
    String perform(String s);
}

@FunctionalInterface
interface StringCompare {
    String perform(String s1, String s2);
}
}
