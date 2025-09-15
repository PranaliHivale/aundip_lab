/* 2. Write a program to check leap year using if else. How to check whether a given year is a leap year or not.[Hint: Take an input of any number. Store it in some variable say year. If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year. Or if a year is exactly divisible by 400 then it is a leap year.] Sample Input 1: 2004 */

//Code:
package Demo;
import java.util.Scanner;

class LeapYearCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Leap year check using if-else
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
        {
            System.out.println(year + " is a Leap Year");
        } 
        else 
        {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}

/* Output:
   Enter a year: 2004
   2004 is a Leap Year */