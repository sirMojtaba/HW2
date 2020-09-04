import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int firstArrayLength = input.nextInt();
//        int secondArrayLength = input.nextInt();
        List<String> firstArray = new ArrayList<>();
        List<String> secondArray = new ArrayList<>();
        for (int i = 0; i < firstArray.size(); i++) {
            firstArray.set(i, input.next());
        }
        for (int i = 0; i < secondArray.size(); i++) {
            secondArray.set(i, input.next());
        }
        if (secondArray.containsAll(firstArray))
            secondArray.removeAll(firstArray);
        for (int i = 0; i < secondArray.size(); i++) {
            System.out.print(secondArray.get(i) + " ");

        }
    }
}
