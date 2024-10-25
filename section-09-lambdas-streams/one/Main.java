package lambdas.one;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Eric");
        names.add("Melissa");
        names.add("Elijah");
        names.add("Milo");

        // for (int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }

//        for (String name: names) {
//            System.out.println(name);
//        }

        names.forEach((n) -> System.out.println(n));

    }
}