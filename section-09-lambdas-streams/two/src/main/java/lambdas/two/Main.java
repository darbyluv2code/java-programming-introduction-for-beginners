package lambdas.two;


public class Main {
    public static void main(String[] args) {
        GreetingsImpl greetings = new GreetingsImpl();
        greetings.greetings();

//        Greetings lambda = public void greetings() {
//            System.out.println("Hello Java Developers!");
//        }

        Greetings lambda = () -> System.out.println("Hello Java Developers!");

//        Greetings lambda = () ->
//                System.out.println("test");
//
//        lambda.greetings();
    }
}

class GreetingsImpl implements Greetings{
    public void greetings() {
        System.out.println("Hello Java Developers!");
    }
}

interface Greetings {
    void greetings();
}



