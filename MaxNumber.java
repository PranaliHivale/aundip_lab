/* 2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. Sample Input: num1 = 10 num2 = 30 */

// Code
package Demo;
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		// Ternary operator to find maximum
		int max = (num1 > num2) ? num1 : num2;

		System.out.println("Maximum number is: " + max);
	}

}

/* Output:
   Enter first number: 10
   Enter second number: 30
   Maximum number is: 30 */