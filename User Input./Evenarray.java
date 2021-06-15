import java.util.Scanner;

public class Evenarray {
    public static void main(String[] args) {
        int i, length;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        length = read.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array elements:");
        for (i = 0; i < length; i++) {
            array[i] = read.nextInt();
        }
        System.out.println("\nArray elements in even position are:");
        for (i = 1; i < length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}