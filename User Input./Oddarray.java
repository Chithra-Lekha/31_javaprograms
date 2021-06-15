import java.util.Scanner;

public class Oddarray {
    public static void main(String[] args){
        int i, length;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the length:");
        length = read.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the no of elements:");
        for (i = 0; i < length; i++) {
            array[i] = read.nextInt();
        }
        System.out.println("\nArray elements in odd position are:");
        
        for (i = 0; i < length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
} 