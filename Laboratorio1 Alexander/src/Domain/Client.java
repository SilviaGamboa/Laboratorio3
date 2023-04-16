
package Domain;

import java.util.ArrayList;

public class Client {
    
    private String id;
    private String name;
    private String phone;
    private String adress;
    private ArrayList<Account> accounts;

    public Client(String id, String name, String phone, String adress, Account account) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.accounts = new ArrayList<Account>();
        this.accounts.add(account);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    @Override
    public String toString() {
        String info = "\nCLIENT PERSONAL DATA:\n";
        info+= "\n Id: "+getId();
        info+= "\n Name: "+getName();
        info+= "\n Phone: "+getPhone();
        info+= "\n Adress: "+getAdress();
        info+= "\n Account(s): ";
        for (int i = 0; i < this.accounts.size(); i++) {
             info+= "\n "+getAccounts().get(i).getAccountNumber();
        }//for
        return info;
    }//toString
    
}//class
