
package Domain;

import java.util.Date;
import javax.swing.JOptionPane;

public class SavingAccount extends Account{
   
    private Date date;
    private int montlyTerm;
    private float interest;
    
    public SavingAccount(){
    }
    
    public SavingAccount(String accountNumber, double balance, Bank bank) {
        super(accountNumber, balance, bank);
    }

    public SavingAccount(Date date, int montlyTerm, float interest, String accountNumber, double balance, Bank bank) {
        super(accountNumber, balance, bank);
        this.date = date;
        this.montlyTerm = montlyTerm;
        this.interest = interest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMontlyTerm() {
        return montlyTerm;
    }

    public void setMontlyTerm(int montlyTerm) {
        this.montlyTerm = montlyTerm;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterests;
        totalInterests = this.getMontlyTerm() * this.getBalance() * this.getInterest();
        return this.getBalance()+this.getInterest();
    }//interestCalculation

    @Override
    public boolean withdraw(double amount) {
        if(amount>this.getBalance()){
            JOptionPane.showMessageDialog(null, "NOT ENOUGHT FUNDS ON BALANCE, TRY AGAIN", "NO FUNDS", JOptionPane.ERROR_MESSAGE);
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
        String info = "\n SAVING ACCOUNT DETAILS:\n";
        info+= "\n  Monthly Term: " + this.getMontlyTerm();
        info+= "\n  Saving StartDate: " + this.getDate();
        info+= "\n  Interest: " + this.getInterest();
        info+= "\n  Balance + interest: " + this.interestCalculation()+"\n";
        return super.toString()+info;
    }//toString
    
    

}//class
