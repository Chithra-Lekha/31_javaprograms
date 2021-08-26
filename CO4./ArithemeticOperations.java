package Arithematic;
import java.util.Scanner;
interface Operations{
	void sum();
	void difference();
	void multiplication();
	void division();
}
class Results implements Operations{
	public void sum(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		float sum=a+b;
		System.out.println("sum:"+sum);
	}
	public void difference(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		float dif=a-b;
		System.out.println("difference:"+dif);
	}
	public void multiplication(){
		;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		float mul=a*b;
		System.out.println("multiplication:"+mul);
	}
	public void division(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		float div=a/b;
		System.out.println("division:"+div);
	}

}
class ArithemeticOperations{
		public static void main(String ar[]){
			Results re=new Results();
			System.out.println();
			System.out.println("Sum:");
			re.sum();
			System.out.println();
			System.out.println("Difference:");
			re.difference();
			System.out.println();
			System.out.println("Multiplication:");
			re.multiplication();
			System.out.println();
			System.out.println("Division:");
			re.division();
			
		}
}