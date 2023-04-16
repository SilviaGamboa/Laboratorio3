/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Account;
import Domain.CenterBanck;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorios
 */
public class TransactionLog {
    private int transactionId;
    private String event;
    private Date date;
    private Account account;
    private double movement;
    private CenterBanck centerbank;

    public TransactionLog() {
    }

    

    public TransactionLog(String event, Account account, double movement) {
        this();
        this.date= new java.util.Date();
        this.event = event;
        this.account = account;
        this.movement = movement;
        
    }
    

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public CenterBanck getCenterbank() {
        return centerbank;
    }

    public void setCenterbank(CenterBanck centerbank) {
        this.centerbank = centerbank;
    }
    public void withdraw(double money){
        account.withdraw(money);
        
    }
    public void deposit(double money){
        account.deposit(money);
    }
    public void sinpeMovil(double money,Account accounts[], String numAccount, String Phone, String motive,CenterBanck centerBank ) {//RECIBE LISTA DE CUENTAS CREADAS, el numero de la cuenta de retiro y el numero de telefono a transferir mas el monto
        for(int i=0;i<accounts.length; i++){//recorre las cuentas
            if(accounts[i]!=null){
            if (accounts[i].getAccountNumber().equals(numAccount)){//verifica los numeros de cuenta buscando el solicitado
                for(int e=0; e<accounts.length; e++){//si lo enuentra entonsces recorre de nuevo el arreglo y busca la otra cuenta
                 if(accounts[e]!=null){
                    if(accounts[e].getClient().getPhone().equals(Phone)){//cuando encuentra la otra cuenta llama al metodo sinpemovil de centralbank
                    if(accounts[i].getBalance()>money){
                        if(centerBank.sinpeMovil(accounts[i].getCommercialBankName().getCommercialBankName(),accounts[e].getCommercialBankName().getCommercialBankName() , money)==true){//verifica que en la cuenta haya fondos y realiza la transaccion interna
                 accounts[i].withdraw(money);//hace el retiro de la cuenta
                 accounts[e].deposit(money);//deposita en la cuenta
                 }else
                     JOptionPane.showMessageDialog(null,"NO MONEY IN COMMERCIAL BANK ACCOUNT");
                 }else{
                      JOptionPane.showMessageDialog(null,"NO MONEY IN ACCOUNT");  
                    }
                    }
                }
                }
            }
            }
           
            
        }
        }
        
        
@Override
   public String toString(){
         String info = "\nGENERAL BANK INFORMATION:\n";
        info+= "\nEvent id: "+this.getTransactionId();
        info+= "\nEvent Type: "+this.getEvent();
        info+= "\nDate: "+this.getDate();
        info+= "\nMovement: "+this.getMovement();
        info+= "\nAffected Account: "+this.getAccount().toString();
        info+= "\nCenter Bank: \n "+this.centerbank.toString();
        return "\n"+super.toString()+info;
   }


    
    
    
}
