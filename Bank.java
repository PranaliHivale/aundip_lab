/* 1.Create a Bank class and declare an instance variable named amount of type double.

Create parameterized constructor to initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).

Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw. Later on, deposit 5000 in the account balance. At the end display total balance on the console. String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";

[Hint: Use constructor, ternary operator] Sample input: Amount=10000 Withdrawal amount=5000 Deposit amount=5000 */

// Code:
package Demo;

public class Bank {
	double amount; // instance variable

    // Parameterized constructor
    Bank(double amount) 
    {
        this.amount = amount;
    }

    // Withdraw method using ternary operator
    void withdraw(double withdrawalAmount) 
    {
        String message = (withdrawalAmount <= amount) 
        		? "Withdrawal successful" 
                : "Insufficient balance";

        System.out.println(message);

        // Update balance only if sufficient funds
        amount = (withdrawalAmount <= amount) 
        		? (amount - withdrawalAmount) 
        		: amount;
    }

    // Deposit method
    void deposit(double depositAmount) 
    {
        amount += depositAmount;
        System.out.println("Deposit successful: " + depositAmount);
    }

    // Display balance
    void displayBalance() 
    {
        System.out.println("Total Balance: " + amount);
    }

    // Main method
    public static void main(String[] args) 
    {
        Bank account = new Bank(10000); // Initial amount = 10000

        account.withdraw(5000); // Withdraw 5000
        account.deposit(5000);  // Deposit 5000
        account.displayBalance(); // Display final balance
	}

}

/* Output:
   Withdrawal successful
   Deposit successful: 5000.0
   Total Balance: 10000.0 */
