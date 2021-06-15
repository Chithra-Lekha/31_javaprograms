import java.util.Scanner;

public class Smallestelement {
    public static void main(String[] args){
        int i, length, small = 0;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the no of elements");
        length = read.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array elements:");
        for (i = 0; i < length; i++) {
            array[i] = read.nextInt();
            small = array[i] < small ? array[i] : small ;
        }
        System.out.println("\nSmallest element in the array is :"+ small);
    }
}