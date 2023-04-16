/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author User
 */
public class CurrentAccount extends Account {
     private float interest;

    public CurrentAccount() {
    }

    public CurrentAccount(float interest) {
        this.interest = interest;
    }

    public CurrentAccount(float interest, String accountName, Domain.Client Client, double balance, String commerBankName) {
        super(accountName, Client, balance, commerBankName);
        this.interest = interest;
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
        totalInterest = super.getBalance() *  this.interest / 12;
        super.setBalance(super.getBalance()+totalInterest);
        return totalInterest;
    }//calculo de intereses
     @Override
    public void withdraw(double money){
        if(money>this.getBalance())
            System.out.println("NO MONEY");
        else 
            super.setBalance(this.getBalance()-money);
       System.out.println(money + "HAS BEEN WITHDRAWNT" );
    }//retiro

        
    @Override
    public void deposit(double money) {
    this.setBalance(this.getBalance()+money);
    System.out.println(money + "HAS BEEN DEPOSITED" );    
    }//deposito

   
           @Override 
   public String toString(){
      String info = "\nCURRENT ACCOUNT DETAILS:\n";
        info+= "\nInterest: "+this.getInterest();
        info+= "Balance + interest: "+this.interestCalculation();
        return "\n"+super.toString()+info;
   }//to string
    

    

    
     
    
}
