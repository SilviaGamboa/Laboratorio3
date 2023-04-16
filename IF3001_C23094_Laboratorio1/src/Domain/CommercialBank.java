/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author User
 */
public class CommercialBank {
    private String commercialBankName;
      private double commercialBankBalance;

    public CommercialBank() {
    }

    public CommercialBank(String commercialBankName) {
        this.commercialBankName = commercialBankName;
        this.commercialBankBalance= 0.0;
        
    }

    public String getCommercialBankName() {
        return commercialBankName;
    }

    public void setCommercialBankName(String commercialBankName) {
        this.commercialBankName = commercialBankName;
    }

    public double getCommercialBankBalance() {
        return commercialBankBalance;
    }

    public void setCommercialBankBalance(double commercialBankBalance) {
        this.commercialBankBalance = commercialBankBalance;
    }
   
    @Override
      public String toString(){
        String info="COMMECIALBANK DATA \n";
        info+= "Commercialbank Name: " + getCommercialBankName() + "\n";
         info+= "Commercialbank Balance: " + getCommercialBankBalance() + "\n";
          
        
        return info;
    }
    
}
