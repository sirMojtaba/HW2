import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            List<String> array = new ArrayList<>();
            System.out.println("*** For exit Enter < exit > ***");
            System.out.println("Enter numbers with operand:");
            for (int i = 0; i < 3; i++) {
                String string = scanner.next();
                array.add(string);
            }
            if (array.contains("+")) {
                double add = Double.parseDouble(array.get(0)) + Double.parseDouble(array.get(2));
                System.out.println("Answer is: " + add);
            }
            else if (array.contains("-")) {
                double sub = Double.parseDouble(array.get(0)) - Double.parseDouble(array.get(2));
                System.out.println("Answer is: " + sub);
            }
            else if (array.contains("*")) {
                double mul = Double.parseDouble(array.get(0)) * Double.parseDouble(array.get(2));
                System.out.println("Answer is: " + mul);
            }
            else if (array.contains("^")) {
                double pow = Math.pow(Double.parseDouble(array.get(0)), Double.parseDouble(array.get(2)));
                System.out.println("Answer is: " + pow);
            }
            else if (array.contains("/")) {
                double div = Double.parseDouble(array.get(0)) / Double.parseDouble(array.get(2));
                System.out.println("Answer is: " + div);
            }
            else if(array.contains("exit")) {
                System.out.println("Thanks, hope to see you later...");
                break;
            }
            else
                System.out.println("Enter valid");
        }
    }
}
