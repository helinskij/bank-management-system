public class bankAccount {
    private String accountNumber;
    private double balance;
    private user accountHolder;

    public bankAccount(String accountNumber, user accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void transfer(bankAccount toAccount, double amount){
        if(balance>=amount){
            this.withdraw(amount);
            toAccount.deposit(amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public double getBalance(){
        return balance;
    }

    public user getAccountHolder(){
        return accountHolder;
    }
}
