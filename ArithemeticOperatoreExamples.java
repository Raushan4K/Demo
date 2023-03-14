package test;
import java.util.Scanner;

public class ArithemeticOperatoreExamples 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		  int num1=sc.nextInt();
		  System.out.println("Enter the second number");
		  int num2= sc.nextInt();
		  int sum=num1 + num2;
		  int sub=num1 -num2;
		  int mul=num1 * num2;
		  int div=num1/num2;
		  int mod=num1%num2;
		  
		  System.out.println("Sum of 2 numbers"+sum);
		  System.out.println("Subtract of 2 numbers"+sub);
		  System.out.println("Multiplication of 2 numbers"+mul);
		  System.out.println("Div. of 2 numbers"+div);
		  System.out.println("Modulus of 2 numbers"+mod);
		  
		  
		  
		
	

	}

}
