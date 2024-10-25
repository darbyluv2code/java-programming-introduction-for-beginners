package collections.arraylists.version1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Normal Arrays */
        String[] todoItems = new String[3];
        todoItems[0] = "Array - Take out the trash";
        todoItems[1] = "Array - Clean the dishes";
        todoItems[2] = "Array - Prep dinner";

//        for (String item: todoItems) {
//            System.out.println(item);
//
//        }

        /** Show List in front as well */
        //List<String> todoItemsArrayList = new ArrayList<String>();
        ArrayList<String> todoItemsArrayList = new ArrayList<String>();
        todoItemsArrayList.add("Take our the trash");
        todoItemsArrayList.add("Clean the dishes");
        todoItemsArrayList.add("Prep dinner");
        todoItemsArrayList.add(0, "Take dog on a walk");
        todoItemsArrayList.set(0, "Take dog to the groomer");

        //todoItemsArrayList.addAll(List.of(todoItems));

        for (String item: todoItemsArrayList) {
            System.out.println(item);
        }

        System.out.println(todoItemsArrayList.get(3));


        // ArrayList<String> x = new ArrayList<>(List.of(todoItems));
    }
}
