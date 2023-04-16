
package Domain;

import java.util.ArrayList;

public class CentralBank extends Bank{
    
    private double globalEconomyBalance;
    private ArrayList<CommercialBank> commercialBanks;
    
    
    public CentralBank(String name, double globalEconomyBalance) {
        super(name, globalEconomyBalance);
        this.globalEconomyBalance = globalEconomyBalance;
        this.commercialBanks = new ArrayList<CommercialBank>();
    }

    public double getGlobalEconomyBalance() {
        return globalEconomyBalance;
    }

    public void setGlobalEconomyBalance(double economyBalance) {
        this.globalEconomyBalance = economyBalance;
    }

    public ArrayList<CommercialBank> getCommercialBanks() {
        return commercialBanks;
    }

    public void setCommercialBanks(ArrayList<CommercialBank> commercialBanks) {
        this.commercialBanks = commercialBanks;
    }

    @Override
    public void credit(double amount, Bank bank){
 
    }
    
    @Override
    public void debit(double amount){
        
    }

    @Override
    public void internalBanksTransaction(double amount, Bank bankDebit, Bank bankCredit) {
        boolean b1 = false;
        boolean b2 = false;
        
        //validates if the two banks are in Central Banks clients
        for (int i = 0; i < this.commercialBanks.size(); i++) {
            if (bankDebit.equals(this.commercialBanks.get(i))) b1=true;
            if (bankCredit.equals(this.commercialBanks.get(i))) b2=true;
        }
        
        if (amount<=super.getBankBalance()&& b1==true && b2 ==true) {
            bankCredit.setBankBalance(bankCredit.getBankBalance()+amount);
        } 
    }//internalBanksTranstacion
    
    @Override
    public String toString() {
        String info = "\n CENTRAL BANK INFORMATION";
        info+= "\n Global Economy balance: " + this.globalEconomyBalance;
        info+= "\n Central bank balance: " + this.getBankBalance();
        if (commercialBanks.size()>0) {
            info+= "\n Central bank clients: ";
                for (int i = 0; i < commercialBanks.size(); i++) {
                    info+= "\n   -----------------------------------------------";
                    info+= "\n   Name: "+commercialBanks.get(i).getName();
                    info+= "\n   Balance: "+commercialBanks.get(i).getBankBalance();
                }//for       
        }else{
            info+= "\n Central bank clients: NULL"; 
        }//if
        return info;
    }//toString

}//class
