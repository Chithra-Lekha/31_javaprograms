import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Printarraybuffer {
    public static void main(String[] args) throws IOException {
        int i, length;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements:");
        length = Integer.parseInt(read.readLine());
        int[] array = new int[length];
        System.out.println("Enter the elements of array:");
        for(i=0; i < length; i++){
            array[i] =Integer.parseInt(read.readLine());
        }
        System.out.println("\nThe array elements are:");
        for (i=0; i<length; i++)
        {
            System.out.println(array[i]);
        }

    }
}