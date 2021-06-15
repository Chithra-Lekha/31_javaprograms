import java.util.Scanner;

public class Lengthofarray{
    public static void main( String[] args) {
        int i, n;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        n = read.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }
        System.out.println("\nThe length of the Array is :"+ array.length);
    }
}