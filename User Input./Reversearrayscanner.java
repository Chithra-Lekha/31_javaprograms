import java.util.Scanner;

class Reversearrayscanner {
    public static void main(String[] args){
        int i,length;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit:");
        length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of array:");
        for(i=0; i < length; i++){
            myArray[i] = s.nextInt();
        }
        System.out.println("\nThe array elements are:\n");
        for (i=length-1; i >= 0; i--)
        {
            System.out.println(myArray[i]);
        }

    }
}