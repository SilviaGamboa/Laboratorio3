/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Laboratorios
 */
public abstract class Account {
    //Atributes
    private String accountNumber;
    private Client Client;
    private double balance; //cuenta
 private CommercialBank commercialBankName;
    public Account() {
    }

    public Account(String accountName, Client Client, double balance, String commerBankName) {
        this.accountNumber = accountName;
        this.Client = Client;
        this.balance = balance;
        this.commercialBankName= new CommercialBank();
        this.commercialBankName.setCommercialBankName(commerBankName);
        this.commercialBankName.setCommercialBankBalance(this.getBalance());
    
    }

    public CommercialBank getCommercialBankName() {
        return commercialBankName;
    }

    public void setCommercialBankName(CommercialBank commercialBankName) {
        this.commercialBankName = commercialBankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client) {
        this.Client = Client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract double interestCalculation();
    public abstract void withdraw(double money);
    public abstract void deposit(double money);
    
    
    @Override
    public String toString(){
          String info = "ACCOUNT DATA:\n";
        info+= "Account Number: "+this.getAccountNumber()+"\n";
        info+= "Balance: "+this.getBalance()+"\n";
        info+= "Client Name: "+this.Client.getName()+"\n";
        info+= "BankCommercial: "+"\n" +this.commercialBankName.toString();
        
        return info;
    }

    
    
    
    
}
