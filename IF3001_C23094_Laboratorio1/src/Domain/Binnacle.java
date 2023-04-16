/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Binnacle {
    public void saveBinnacle(String registro){
        DataOutputStream  dos;
        try {
            dos= new DataOutputStream(
                    new FileOutputStream("Binnacle.txt",true));
            try {
                dos.writeUTF(registro);
            } catch (IOException ex) {
                Logger.getLogger(Binnacle.class.getName()).log(Level.SEVERE, null, ex);
            }
       
            try {
                dos.close();
            } catch (IOException ex) {
                Logger.getLogger(Binnacle.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Binnacle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
