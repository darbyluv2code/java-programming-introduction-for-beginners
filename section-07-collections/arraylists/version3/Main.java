package collections.arraylists.version3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<TodoItem> todoList = new ArrayList<>();


        todoList.add(new TodoItem("Walk the dog", 3));
        todoList.add(new TodoItem("Learn Java", 5));

//        todoList.remove(0);

        for (TodoItem item: todoList) {
            System.out.println(item.getTitle() + " has a priority of: " + item.getPriority());
        }

    }
}
