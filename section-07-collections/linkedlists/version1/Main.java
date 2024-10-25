package collections.linkedlists.version1;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /** Show List in front as well */
        LinkedList<Integer> todoItemsLinkedList = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>(List.of(167, 210, 500, 320, 870, 210, 10));
//        System.out.println(numbers.get(1));

         todoItemsLinkedList.add(167);
//        todoItemsLinkedList.add(210);
//        todoItemsLinkedList.add(500);
//        todoItemsLinkedList.add(0, 870);
//        todoItemsLinkedList.set(0, 100);
//
        /*** Add first and last*/
//        // Part of Deques and Queues
        todoItemsLinkedList.addFirst(90);
//        todoItemsLinkedList.addLast(900);
        todoItemsLinkedList.offerFirst(80);
        todoItemsLinkedList.offer(90);
        todoItemsLinkedList.offerLast(91);
        todoItemsLinkedList.push(79);



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
        //numbers.removeFirst();
//        numbers.removeLast();
        // Same as removeFirst
        //numbers.pop();
        // Same as removeFirst
        //numbers.poll();
        //numbers.pollFirst();
//        numbers.pollLast();

        /** Retain */
//        numbers.retainAll(List.of(167, 320));

        /** Sort */
//        numbers.sort(Comparator.naturalOrder());
//        numbers.sort(Comparator.reverseOrder());

        /** Is Empty */
//        LinkedList<String> noItemsInThisLinkedList = new LinkedList<>();
//        System.out.println(noItemsInThisLinkedList.isEmpty());

        for (int number: numbers) {
            System.out.println(number);
        }

        /** See only the first and last element */
        System.out.println(todoItemsLinkedList.peekFirst());
        System.out.println(todoItemsLinkedList.peekLast());
    }
}

