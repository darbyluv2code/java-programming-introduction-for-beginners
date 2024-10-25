package collections.hashsets.version1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<String>();
        books.add("Demo Book");
        books.add("Harry and his friends");
        books.add("Eric takes on photography");
        books.add("Chad loves Java");
        books.add("Always be learning");
        System.out.println(books);


        //books.remove("Eric takes on photography");

        /*Does not do anything*/
        //books.remove(0);

//        for (String book : books) {
//            System.out.println(book);
//        }

        System.out.println(books.contains("Harry and his friends"));

        System.out.println(books.size());

        books.clear();

        System.out.println(books.isEmpty());


    }
}
