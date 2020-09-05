import java.util.*;

public class Color {
    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("blue");
        first.add("yellow");
        first.add("white");
        first.add("orange");
        first.add("violet");
        first.add("black");
        first.add("red");
        first.add("green");

        List<String> second = new ArrayList<>();
        second.add("black");
        second.add("orange");
        second.add("red");
        second.add("blue");
        second.add("indigo");
        removeCommonElements(first, second);
        System.out.println(first);
    }

    public static List removeCommonElements(List<String> first, List<String> second) {
        Iterator<String> i = first.iterator();
        while(i.hasNext()){
            String common = i.next();
            if(second.contains(common)) {
                i.remove();
            }
        }
        return first;
    }
}
