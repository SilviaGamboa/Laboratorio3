/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Laboratorios
 */
public class Client {
    private String id;
    private String name;
    private String address;
    private String phone;

    //defauld
    public Client() {
    }
    //sobrecargado
    public Client(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
    public String toString(){
        String info="CLIENT PERSONAL DATA: \n";
        info+= "Id: " + getId() + "\n";
         info+= "Name: " + getName() + "\n";
          info+= "Adrres: " + getAddress() + "\n";
           info+= "Id: " + getPhone() + "\n";
        
        return info;
    }
    
}
