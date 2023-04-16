
package Domain;

import javax.swing.JOptionPane;

public class ChekingAccount extends Account {
    private float interest;

    public ChekingAccount() {
    }

    public ChekingAccount(String accountNumber, double balance, Bank bank) {
        super(accountNumber, balance, bank);
    }

    public ChekingAccount(String accountNumber, double balance, float interest, Bank bank) {
        super(accountNumber, balance, bank);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterest;
        totalInterest = this.getBalance() * this.getInterest() / 12;
        return this.getBalance()+this.getInterest();
    }//interestCalculation

    @Override
    public boolean withdraw(double amount) {
        if(amount>this.getBalance()){
            JOptionPane.showMessageDialog(null, "NOT ENOUGH FUNDS ON BALANCE, TRY AGAIN", "NO FUNDS", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            super.setBalance(this.getBalance() - amount);
            return true;  
        }//if
    }//withdraw

    @Override
    public void deposit(double amount) {
        super.setBalance(this.getBalance() + amount);
    }//deposit
    
    @Override
    public String toString() {
        String info = "\n CHEKING ACCOUNT DETAILS:\n";
        info+= "\n  Interest: " + this.getInterest();
        info+= "\n  Balance + interest: " + this.interestCalculation()+"\n\n";
        return super.toString()+info;
    }//toString

}//class
