/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class SavingAccount extends Account{

    private Date date;
    private int monthlyTerm;
    private float interest;
   

    public SavingAccount() {
    }

    public SavingAccount(Date date, int monthlyTerm, float interest) {
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
        
    }

    public SavingAccount(Date date, int monthlyTerm, float interest, String accountName, Domain.Client Client, double balance, String commerBankName) {
        super(accountName, Client, balance, commerBankName);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

   

    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    
    
    
    @Override
    public double interestCalculation(){
        double totalInterest;
        totalInterest =this.getMonthlyTerm()
           *this.getBalance()
                *this.getInterest();
        super.setBalance(super.getBalance()+totalInterest);
        return totalInterest;
    }//calculo de intereses
    
    @Override
    public void withdraw(double money){
        if(money>this.getBalance()){
            System.out.println("NO MONEY");}
        else {
            super.setBalance(this.getBalance()-money);
       System.out.println(money + "HAS BEEN WITHDRAWNT" );
        }}//retiro

        
        
    @Override
    public void deposit(double money) {
       this.setBalance(this.getBalance()+money);
    System.out.println(money + "HAS BEEN DEPOSITED" );
    }//deposito
    
    
    
       @Override 
   public String toString(){
      String info = "\nSAVING ACCOUNT DETAILS:\n";
        info+= "\nMonthly Term: "+this.getMonthlyTerm();
        info+= "\nSaving StartDate: "+this.getDate();
        info+= "\nInterest: "+this.getInterest();
        info+= "Balance + interest: "+this.interestCalculation();
        
        return "\n"+super.toString()+info;
   }//to string
    
}
