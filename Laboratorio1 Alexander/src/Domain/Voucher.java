
package Domain;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Voucher {
    private String documentID;
    private String eventType;
    private LocalDateTime date;
    private String OriginAccount;
    private String destinationAccount;
    private String debitedAmount;
    private String details;
    private String accountToString;
    private String account2ToString;

    public Voucher(String documentID, String eventType, String OriginAccount, String destinationAccount, String debitedAmount, String details, LocalDateTime date, String accountToString, String account2ToString) {
        this.documentID = documentID;
        this.eventType = eventType;
        this.OriginAccount = OriginAccount;
        this.destinationAccount = destinationAccount;
        this.debitedAmount = debitedAmount;
        this.details = details;
        this.date = date;
        this.accountToString = accountToString;
        this.account2ToString = account2ToString;

    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getOriginAccount() {
        return OriginAccount;
    }

    public void setOriginAccount(String OriginAccount) {
        this.OriginAccount = OriginAccount;
    }

    public String getSinpeMovilAddressee() {
        return destinationAccount;
    }

    public void setSinpeMovilAddressee(String SinpeMovilAddressee) {
        this.destinationAccount = SinpeMovilAddressee;
    }

    public String getDebitedAmount() {
        return debitedAmount;
    }

    public void setDebitedAmount(String debitedAmount) {
        this.debitedAmount = debitedAmount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getAccountToString() {
        return accountToString;
    }

    public void setAccountToString(String accountToString) {
        this.accountToString = accountToString;
    }

    public String getAccount2ToString() {
        return account2ToString;
    }

    public void setAccount2ToString(String account2ToString) {
        this.account2ToString = account2ToString;
    }

    public void printVoucher(){
        JOptionPane.showMessageDialog(null, this.toString());
    }//printVoucher

    @Override
    public String toString() {
        String info = "SINPE MOVIL VOUCHER\n";
        info+="\nEvent id: "+this.documentID;
        info+="\nEvent type: "+this.eventType;
        info+="\nDate: "+this.date;
        info+="\nAmount: "+this.debitedAmount;
        info+="\nDebited to: "+this.OriginAccount;
        info+="\nCredited to: "+this.destinationAccount;
        
        return info;
    }
    
}//class
