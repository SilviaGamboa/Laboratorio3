/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Account;
import Domain.Binnacle;
import Domain.CenterBanck;
import Domain.Client;
import Domain.CommercialBank;
import Domain.CurrentAccount;
import Domain.SavingAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransactionLogTest {

    public TransactionLogTest() {
    }
     public void test(){
         ArrayList<CommercialBank> commercialBanks= new ArrayList();
         
         CenterBanck centerBank = new CenterBanck();
         
         String bill="";
         Client clients[]= new Client[10];
         clients[0]= new Client("30400404040", "Luis", "TurriCity", "82828282");
         Date date = new Date(2023/03/17);
         float currentInterest=(float)(0.02);
         
         clients[1]= new Client("4538340", "Juan", "SilencioCity", "94782654");
         
         Account accounts[]= new Account[10];
         accounts[0]=new SavingAccount(date, 12, currentInterest, "1", clients[0], 10000, "BCR" );
         accounts[1]=new CurrentAccount(currentInterest, "2", clients[1], 20000, "BN");
         for (int e=0; e<accounts.length;e++){
             if(accounts[e]!=null)
             commercialBanks.add(accounts[e].getCommercialBankName());
         }
         centerBank.setAccountsCommercialBanks(commercialBanks);
        //banck 
         TransactionLog tl[]= new TransactionLog[5];
        
         tl[0] = new TransactionLog("WithDraw", accounts[0], 35000);
         //llama metodo retirar
         tl[0].withdraw(35000);


         
         tl[1] = new TransactionLog("Deposit", accounts[1], 10000);
         //llama metodo depositar
         tl[1].deposit(10000);
         
         
         tl[2]= new TransactionLog("Sinpe", accounts[1], 5000);
         //llama metodo sinpemovil
         tl[2].sinpeMovil(5000, accounts, "2","82828282", "prueba", centerBank);
//         tl[3]=new TransactionLog("Sinpe", accounts[0], 40000);
//         tl[3].sinpeMovil(40000, accounts, "1", "94782654", "prueba2", centerBank);
         for (int i=0; i<tl.length; i++){
             tl[i].setTransactionId(i+1);
             
            if (tl[i]!=null) {
                tl[i].setCenterbank(centerBank);
             System.out.println(tl[i].toString());
             
                
              
         }//if
          
         bill=tl[i].toString();
              Binnacle binnacle= new Binnacle();
              binnacle.saveBinnacle(bill);
         }//FOR
         
        
     }
}
