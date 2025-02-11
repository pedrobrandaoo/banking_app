import java.util.Scanner;

public class Account {

    String customerName;
    String customerID;
    int balance = 0;
    String separator = "**************************************************";
    String previousTransaction = "";

    // Class constructor
    Account (String cName, String cID) {
        customerName = cName;
        customerID = cID;
    }

    //function to check balance
    void checkBalance() {
        System.out.println("\n Your balance is " + balance + "€\n");
        previousTransaction = "Balance check" ;
    }

    //function to make a deposit
    void deposit (int amount) {
        previousTransaction = "Deposit";
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited €" + amount);
        } else {
            System.out.println("Successfully deposited €" + amount);
        }
    }

    // funciton to make a withdrawal
    void withdrawal(int amountW){
            if (balance < amountW)
                System.out.println("Your current is less than requested amount");
            else {
                balance -= amountW;
                previousTransaction = "Withdrawal";
            }
        }

    // funciton to make a withdrawal
    void getPreviousTransaction() {
            if (previousTransaction.equals("Balance check"))
                System.out.println("You have made a" + previousTransaction);
            else if (previousTransaction.equals("Deposit"))
                System.out.println("You have made a" + previousTransaction);
            else if (previousTransaction.equals("Withdrawal"))
                    System.out.println("You have made a" + previousTransaction);
            else
                System.out.println("No previous transaction");
        }


    //Show menu
        void ShowMenu() {
            char option ='\0';
            Scanner sc = new Scanner(System.in);
            System.out.println("\n" + separator + "Welcome to the Best banking App" + separator);
            System.out.println("Welcome " + customerName + "\n");
            do {
                System.out.println("Choose an option" + "");
                System.out.println("A. Check balance");
                System.out.println("B. Deposit");
                System.out.println("C. Withdrawal");
                System.out.println("D. View previous transaction");
                System.out.println("E. Exit");
                char option1 = sc.next().charAt(0);
                option = Character.toUpperCase(option1);

                switch (option) {
                    case 'A':
                        checkBalance();
                        break;
                    case 'B':
                        System.out.println("Enter amount to deposit");
                        int amount1 = sc.nextInt();
                        deposit(amount1);
                        break;
                    case 'C':
                        System.out.println("Enter amount to withdraw\n" + separator);
                        int amount2 = sc.nextInt();
                        withdrawal(amount2);
                        break;
                    case 'D':
                        System.out.println(separator);
                        getPreviousTransaction();
                        break;
                    case 'E':
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }while (option != 'E');
                System.out.println("Thanks" + customerName);

        }


    }

