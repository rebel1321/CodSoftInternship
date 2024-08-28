import java.util.Scanner;

public class ATM {
    private BankAccount account;
    public ATM(BankAccount account){
        this.account =account;
    }
    public void start(){
        Scanner scanner =new Scanner(System.in);
        boolean running =true;

        while(running){
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter amount to deposit: Rs");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: Rs");
                    double withdrawAmount  = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is: Rs" + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }
    private void displayMenu() {
        System.out.println("\n=== Welcome to the ATM ===");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
    }
}
