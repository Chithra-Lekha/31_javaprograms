import java.util.Scanner;

public class Largestelement {
    public static void main(String[] args){
        int i, length, large=0;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the no of elements");
        length = read.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array elements:");
        for (i = 0; i < length; i++) {
            array[i] = read.nextInt();
            large = array[i] > large ? array[i] : large ;
        }
        System.out.println("\nLargest element in the array is :"+ large);
    }
}