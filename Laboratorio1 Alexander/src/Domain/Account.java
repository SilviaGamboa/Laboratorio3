
package Domain;

public abstract class Account {
    
    private String accountNumber;
    private double balance;
    private Bank bank;

    public Account() {
    }
    
    public Account(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    
    //methods in order to represent polymorphism
    public abstract double interestCalculation();
    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);
    
    @Override
    public String toString() {
        String info = "\n ACCOUNT DATA:\n";
        info+= "\n  Account Number: "+this.getAccountNumber();
        info+= "\n  Balance: "+this.getBalance()+"\n";
        return info;
    }//toString
    
    public String statetInfoToString(){
        String info = "\n      Account Number: "+this.getAccountNumber();
        info+= "\n      Balance: "+this.getBalance();
        return info;  
    }
    
}//class

