
package Domain;

import java.util.ArrayList;

public class CommercialBank extends Bank {
    
    private ArrayList<Client> clients;
    private CentralBank centralBank;
    
    public CommercialBank(String name, double balance, CentralBank centralBank) {
        super(name, balance);
        this.clients = new ArrayList<Client>();
        this.centralBank = centralBank;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    
    @Override
    public void credit(double amount, Bank bank){
        bank.setBankBalance(bank.getBankBalance()+amount);
    }
    
    @Override
    public void debit(double amount){
        super.setBankBalance(this.getBankBalance()-amount);
    }

    @Override
    public void internalBanksTransaction(double amount, Bank bankDebit, Bank bankCredit) {
        if (amount<=super.getBankBalance()) {
            debit(amount);
            this.centralBank.internalBanksTransaction(amount, bankDebit, bankCredit);
        } 
    }

    @Override
    public String toString() {
        
        String info = "\n"+this.getName()+" INFORMATION";
        info+= "\n Bank balance: " + this.getBankBalance();
        
        if (clients.size()>0) {
            info+= "\n Bank clients: ";
                for (int i = 0; i < clients.size(); i++) {
                    info+= "\n   -----------------------------------------------";
                    info+= "\n   Name: "+clients.get(i).getName();
                        for (int j = 0; j < clients.get(i).getAccounts().size(); j++) {
                            info+= "\n   Account: "+clients.get(i).getAccounts().get(j).getAccountNumber();
                            info+= "\n   Balance: "+clients.get(i).getAccounts().get(j).getBalance(); 
                        }//for j
                }//for
        }else{
            info+= "\n Bank clients: NULL"; 
        }//if
        return info;
        
    }//toString
    
    
   
    
    
}//class
