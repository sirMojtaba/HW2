package calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: *");
            System.out.println("4: ^");
            System.out.println("5: /");
            System.out.println("6: Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 6) {
                System.out.println("Thanks for your partnership, Good luck...");
                break;
            } else if (choice < 1 || choice > 6)
                System.out.println("***Please enter valid number***");
            else {
                System.out.println("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                calculator.setFirstNumber(firstNumber);
//                String operator = scanner.next();
                System.out.println("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                calculator.setSecondNumber(secondNumber);
                if (choice == 1)
                    System.out.println(calculator.add());
                else if (choice == 2)
                    System.out.println(calculator.minus());
                else if (choice == 3)
                    System.out.println(calculator.multiply());
                else if (choice == 4)
                    System.out.println(calculator.pow());
                else System.out.println(calculator.divide());
            }
        }
    }
}