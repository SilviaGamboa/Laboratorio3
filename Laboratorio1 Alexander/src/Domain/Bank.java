
package Domain;

public abstract class Bank {
    
    private String name;
    private double bankBalance;

    public Bank(String name, double balance) {
        this.bankBalance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    
    public abstract void credit(double amount, Bank bank);
    public abstract void debit(double amount);
    public abstract void internalBanksTransaction(double amount, Bank bankDebit, Bank bankCredit);
    

    @Override
    public String toString() {
        String info = "\n BANK INFO:\n";
        info+="\n Name: " + this.getName();
        info+="\n Bank Balance: "+ this.getBankBalance();
        return info;
    }//toString

}//class
