import java.util.Scanner;

 public class EqualToAndNotEqualToOperator{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first value: ");
		int num1=in.nextInt();
		System.out.println("Enter second value: ");
		int num2=in.nextInt();
		if(num1==num2){
		System.out.println("The two numbers are equal");
		}
		else if(num1!=num2){
		System.out.println("The numbers are not equal");
		}
	}
 }
