/* A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name. [Hint: use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new name with a phone number. The program runs in a loop until the user chooses to exit.] */

//Code:
import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Phone Directory ---");
            System.out.println("1. Add a new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display all contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    directory.put(name, number);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    if (directory.containsKey(searchName)) {
                        System.out.println("Phone Number: " + directory.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    if (directory.isEmpty()) {
                        System.out.println("Directory is empty.");
                    } else {
                        System.out.println("\n--- All Contacts ---");
                        for (String n : directory.keySet()) {
                            System.out.println(n + " : " + directory.get(n));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

/* Output:
   
--- Phone Directory ---
1. Add a new contact
2. Find a contact by name
3. Display all contacts
4. Exit
Enter your choice: 1
Enter name: Pranali
Enter phone number: 9272798564
Contact added successfully!

--- Phone Directory ---
1. Add a new contact
2. Find a contact by name
3. Display all contacts
4. Exit
Enter your choice: 1
Enter name: Shweta
Enter phone number: 7894561230
Contact added successfully!

--- Phone Directory ---
1. Add a new contact
2. Find a contact by name
3. Display all contacts
4. Exit
Enter your choice: 1
Enter name: Shruti
Enter phone number: 9638527410
Contact added successfully!

--- Phone Directory ---
1. Add a new contact
2. Find a contact by name
3. Display all contacts
4. Exit
Enter your choice: 2
Enter name to search: Shweta
Phone Number: 7894561230

--- Phone Directory ---
1. Add a new contact
2. Find a contact by name
3. Display all contacts
4. Exit
Enter your choice: 3

--- All Contacts ---
Shweta : 7894561230
Pranali : 9272798564
Shruti : 9638527410

--- Phone Directory ---
1. Add a new contact
2. Find a contact by name
3. Display all contacts
4. Exit
Enter your choice: 4
Exiting... Goodbye! */