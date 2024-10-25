package collections.arraylists.version2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(167, 210, 500, 320, 870, 210, 10));
        numbers.addAll(List.of(50, 55));
        /** Size / Length */
//        System.out.println(numbers.size());

        /** Contains */
//        System.out.println(numbers.contains(210));
//        System.out.println(numbers.containsAll(List.of(167, 320)));

        /** IndexOf */
//        System.out.println(numbers.indexOf(500));
//        System.out.println(numbers.indexOf(509));
//        System.out.println(numbers.indexOf(210));
//        System.out.println(numbers.lastIndexOf(210));

        /** Remove */
//        numbers.remove(6);
//        numbers.removeAll(List.of(167, 320));

        /** Retain */
//        numbers.retainAll(List.of(167, 320));

        /** Sort */
//        numbers.sort(Comparator.naturalOrder());
//        numbers.sort(Comparator.reverseOrder());

        /** Is Empty */
//        ArrayList<String> noItemsInThisArrayList = new ArrayList<>();
//        System.out.println(noItemsInThisArrayList.isEmpty());

        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
