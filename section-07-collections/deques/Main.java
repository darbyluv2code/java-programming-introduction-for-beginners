package collections.deques;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> cards = new ArrayDeque<>();

        cards.add("King");
        cards.add("Queen");

        System.out.println(cards);

        System.out.println(cards.getFirst());

        cards.addFirst("Ace");

        //System.out.println(deque.getFirst());

        System.out.println(cards.getLast());

        cards.addLast("Jack");

       // System.out.println(deque.getLast());

        cards.removeFirst();

        cards.removeLast();

        cards.peekFirst(); //returns null if empty, getFirst throws exception
        cards.peekLast();

        System.out.println(cards.contains("King"));
        System.out.println(cards.contains("Eric"));
    }
}
