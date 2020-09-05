import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> first = new LinkedList<>();
        first.add("one");
        first.add("two");
        first.add("three");
        first.add("four");

        LinkedList<String> second = new LinkedList<>();
        second.add("five");
        second.add("six");
        second.add("seven");

        for (String elements: first) {
            second.add(elements);
        }

        System.out.println(second);
        second.replaceAll(String::toUpperCase);

        /*for (String elements: second) {
            elements.toUpperCase();
        }*/

        System.out.println(second);
    }
}
