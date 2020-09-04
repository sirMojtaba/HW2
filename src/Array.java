import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Please enter array elements respectively:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Please enter step to shift:");
        int step = input.nextInt();
        int[] shiftedArray = shift(array, step);
        for (int i = 0; i < shiftedArray.length; i++) {
            System.out.print(shiftedArray[i] + " ");
        }
    }

    public static int[] shift(int[] array, int n) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < arrayCopy.length; i++)
            arrayCopy[(i + n) % arrayCopy.length] = array[i];
        return arrayCopy;
    }
}