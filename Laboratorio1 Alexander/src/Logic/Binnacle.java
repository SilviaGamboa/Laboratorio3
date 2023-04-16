
package Logic;

import Domain.Voucher;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Binnacle {
    
    public boolean binnacleWriter(Voucher voucher) throws FileNotFoundException, IOException{
        
        if (voucher == null) return false;
        
        File file=new File("Voucher_"+voucher.getDocumentID()+".txt");                
        FileWriter fileWriter=new FileWriter(file.getName(), true);
        if(file.length()>0)
            fileWriter.write("\n");
        fileWriter.write(voucher.toString());
        fileWriter.close();
        
        File file2=new File("TransactionLog.txt");                
        FileWriter fileWriter2=new FileWriter(file2.getName(), true);
        if(file.length()>0)
            fileWriter2.write("\n");
        fileWriter2.write("DATE: "+voucher.getDate().toString()+"\n");
        fileWriter2.write("EVENT: "+voucher.getEventType().toUpperCase()+"\nID: "+voucher.getDocumentID()+"\n");
        fileWriter2.write("DETAILS: "+voucher.getDetails().toUpperCase()+"\n\n");
        fileWriter2.write(voucher.getOriginAccount().toUpperCase() + " -"+ voucher.getDebitedAmount()+"\n");
        fileWriter2.write(voucher.getAccountToString()+"\n");
        fileWriter2.write(voucher.getDestinationAccount().toUpperCase()+ " +"+ voucher.getDebitedAmount()+"\n");
        fileWriter2.write(voucher.getAccount2ToString()+"\n");
        fileWriter2.write("-----------------------------------------");
        fileWriter2.close();
        
        return true;
    }//binnacleHistorialWriter
 
}//class
