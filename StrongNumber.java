/* 1.Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145 */

//Code
package Demo;
import java.util.Scanner;

class StrongNumber 
{

	// Method to calculate factorial of a digit
	static int factorial(int n) 
	{
		int fact = 1;
		for (int i = 1; i <= n; i++) 
		{
			fact *= i;
		}
		return fact;
	}

	// Method to check if a number is Strong (Parameterized method)
	static void checkStrong(int num) 
	{
		int temp = num, sum = 0;

		while (temp > 0) 
		{
			int digit = temp % 10;
			sum += factorial(digit);
			temp /= 10;
		}

		// Using conditional operator
		String result = (sum == num) ? "Strong Number" : "Not a Strong Number";
		System.out.println(num + " is " + result);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		checkStrong(n); // calling parameterized method
	}
}

/* Output:
   Enter a number: 145
   145 is Strong Number */