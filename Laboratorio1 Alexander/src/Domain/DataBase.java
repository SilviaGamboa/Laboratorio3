
package Domain;

import java.util.ArrayList;
import java.util.Date;

public class DataBase {
    
    private ArrayList<Client> clients;
    private ArrayList<Bank> banks;
    private double globalEconomyBalance;

    public DataBase() {
        this.globalEconomyBalance = 1000000.00;
        createBanks();
        createClients();
    }

    public void createBanks(){
        
        this.banks = new ArrayList<Bank>();
        
        //Central Bank
        CentralBank centralBank = new CentralBank("BANCO CENTRAL DE COSTA RICA",this.globalEconomyBalance);
        this.banks.add(centralBank);
        
        //BCR ArrayID: 1
        Bank bcr = new CommercialBank("BANCO DE COSTA RICA",100000.00, centralBank);
        this.banks.add(bcr);
        centralBank.getCommercialBanks().add((CommercialBank)bcr);
        centralBank.debit(100000.00);
        
        //BN ArrayID: 2
        Bank bn = new CommercialBank("BANCO NACIONAL",300000.00, centralBank);
        this.banks.add(bn);
        centralBank.getCommercialBanks().add((CommercialBank)bn);
        centralBank.debit(300000.00);
        
        //BAC ArrayID: 3
        Bank bac = new CommercialBank("BAC CREDOMATIC",400000.00, centralBank);
        this.banks.add(bac);
        centralBank.getCommercialBanks().add((CommercialBank)bac);
        centralBank.debit(400000.00);
        
    }//createBanks
    
    public void createClients(){
        
        this.clients = new ArrayList<Client>();
        
        //Clients and accounts creation
        Account client1Account = new SavingAccount(new Date(2022, 6, 3), 12, 0.2f, "CR10000000001", 10000, this.banks.get(1));
        Account client1Account2 = new SavingAccount(new Date(2022, 7, 3), 12, 0.6f, "CR10000000003", 15000, this.banks.get(1));
        Client client1 = new Client("60988676", "Alexander Fernandez D", "00000000", "San Jose",client1Account);
  
        client1.getAccounts().add(client1Account2);
        ((CommercialBank)this.banks.get(1)).getClients().add(client1);
        this.clients.add(client1);
        
        Account client2Account = new ChekingAccount("CR10000000002", 40000, 0.5f, this.banks.get(2));
        Client client2 = new Client("50909994", "Jose Herrera Soto", "11111111", "Puntarenas",client2Account);
        ((CommercialBank)this.banks.get(1)).getClients().add(client2);
        this.clients.add(client2);
        
        Account client3Account = new SavingAccount(new Date(2022, 2, 4), 12, 0.2f, "CR20000000001", 20000, this.banks.get(2));
        Client client3 = new Client("30565776", "Daniel Araya Aguilar", "22222222", "Cartago",client3Account);
        ((CommercialBank)this.banks.get(2)).getClients().add(client3);
        this.clients.add(client3);
        
        Account client4Account = new ChekingAccount("CR20000000002", 35000, 0.5f, this.banks.get(3));
        Client client4 = new Client("10343436", "Alana Vargas Ramirez", "33333333", "Limon",client4Account);
        ((CommercialBank)this.banks.get(2)).getClients().add(client4);
        this.clients.add(client4);
        
        Account client5Account = new SavingAccount(new Date(2022, 7, 5), 12, 0.8f, "CR30000000001", 12000, this.banks.get(1));
        Client client5 = new Client("65646465", "Maria Loria Calvo", "44444444", "Cartago",client5Account);
        ((CommercialBank)this.banks.get(3)).getClients().add(client5);
        this.clients.add(client5);
        
        Account client6Account = new ChekingAccount("CR30000000002", 22000, 0.7f, this.banks.get(3));
        Client client6 = new Client("76765575", "Sofia Quesada Yin", "55555555", "Heredia",client6Account);
        ((CommercialBank)this.banks.get(3)).getClients().add(client6);
        this.clients.add(client6);
        
    }//createClients
    
    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }    

    public ArrayList<Bank> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<Bank> banks) {
        this.banks = banks;
    }

    public double getGlobalEconomyBalance() {
        return globalEconomyBalance;
    }

    public void setGlobalEconomyBalance(double globalEconomyBalance) {
        this.globalEconomyBalance = globalEconomyBalance;
    }

    public Client searchClientByPhone(String phone){
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getPhone().equals(phone)) {
                return this.clients.get(i);
            }
        }
        return null;
    }//searchClientByPhone
    
    @Override
    public String toString() {
        String info = " DATABASE INFORMATION";
        info+= "\n Banks: ";
        if (this.banks.size()>0) {
            for (int i = 0; i < this.banks.size(); i++) {
                info+= "\n "+i+". "+this.banks.get(i).getName() + "\n   Current balance: " + this.banks.get(i).getBankBalance();
            }//for
            info+= "\n";
        }//if
        info+= "\n Clients: ";      
        if (this.clients.size()>0) {
            for (int i = 0; i < this.clients.size(); i++) {
                info+= "\n "+i+". "+this.clients.get(i).getName()+" ID: "+this.clients.get(i).getId();
                for (int j = 0; j < this.clients.get(i).getAccounts().size(); j++) {
                    info+= this.clients.get(i).getAccounts().get(j).statetInfoToString();
                }//for j
                
            }//for
            info+= "\n";
        }//if        
        return info;
    }//toString  
    
}//class
