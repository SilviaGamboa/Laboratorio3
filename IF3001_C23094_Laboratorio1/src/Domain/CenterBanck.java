/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CenterBanck {
ArrayList<CommercialBank> accountsCommercialBanks= new ArrayList();

    public CenterBanck() {
    }

    public ArrayList<CommercialBank> getAccountsCommercialBanks() {
        return accountsCommercialBanks;
    }

    public void setAccountsCommercialBanks(ArrayList<CommercialBank> accountsCommercialBanks) {
        this.accountsCommercialBanks = accountsCommercialBanks;
    }
    //recibe el nombre del banco1 y el banco2 y el monto de dinero a debitar
public boolean sinpeMovil(String account1, String account2, double money){
    boolean resp= false;
    for(int i=0; i<this.accountsCommercialBanks.size(); i++){
        if(this.accountsCommercialBanks.get(i).getCommercialBankName().equals(account1)){//encuentra cuenta 1
         for(int e=0; e<this.accountsCommercialBanks.size();e++){
           if(this.accountsCommercialBanks.get(e).getCommercialBankName().equals(account2)){ //encuentra cuenta 2 
            if(this.accountsCommercialBanks.get(i).getCommercialBankBalance()>money){//pregunta si lo que hay en la cuenta es mayor a la cantidad a retirar
            this.accountsCommercialBanks.get(i).setCommercialBankBalance( //si es entoces se resta el monto
                    
                    this.accountsCommercialBanks.get(i).getCommercialBankBalance()-money);
                    
            this.accountsCommercialBanks.get(e).setCommercialBankBalance(this.accountsCommercialBanks.get(e).getCommercialBankBalance()+money);//aqui deposita el dinero en la cuenta2
                   resp= true;
          }else{
                
              
              resp=false;
          }//if
         } //if   
         } //for
        }//if
    }//for
    return resp;
}

public String toString(){
        String info="CENTERBANK DATA: \n";
        info+= this.accountsCommercialBanks.toString();
        
        return info;
    }
}
