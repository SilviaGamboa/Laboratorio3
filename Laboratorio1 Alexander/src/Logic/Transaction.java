
package Logic;

import Domain.Client;
import Domain.Voucher;
import java.time.LocalDateTime;

public class Transaction {
    
    private int transactionId;
    private Voucher voucher;
    private static int consecutive = 1;


    
    public Transaction(Client clientDebitTo, Client clientCreditTo, double amount, String details, int selectedAccount) {
    
        LocalDateTime date = java.time.LocalDateTime.now();
        if (clientCreditTo != null) {
            if (clientDebitTo.getAccounts().get(selectedAccount).withdraw(amount)) {
                this.transactionId = consecutive++;
                clientCreditTo.getAccounts().get(0).deposit(amount);
                clientDebitTo.getAccounts().get(selectedAccount).getBank().internalBanksTransaction(amount,
                clientDebitTo.getAccounts().get(0).getBank(),
                clientCreditTo.getAccounts().get(0).getBank());
                this.voucher = new Voucher(""+transactionId,
                "Sinpe Movil Transfer",
                clientDebitTo.getName() + " " + clientDebitTo.getAccounts().get(0).getAccountNumber(),
                clientCreditTo.getName()+ " " + clientCreditTo.getAccounts().get(0).getAccountNumber(),
                ""+amount,
                details,
                date,
    clientDebitTo.getAccounts().get(selectedAccount).toString(),
   clientCreditTo.getAccounts().get(0).toString());
            }//if 
        }
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        Transaction.consecutive = consecutive;
    }
    


}//class
