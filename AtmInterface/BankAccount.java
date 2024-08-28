public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Successfully deposited: Rs" + amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Sucessfully withdrawn: Rs" + amount);
        }else if(amount >balance){
            System.out.println("Insufficient balance!");
        }else{
            System.out.println("Invalid withdrawl amount.");
        }
    }
    public double checkBalance(){
        return balance;
    }
}
