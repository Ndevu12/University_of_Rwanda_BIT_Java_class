//import Account;
/* Bankaccount - This class is used to create a bank account 
 * and used to access the accounts in the bank account list
 * and make manipulations on the accounts in the bank account list
 * main - this function used to call Account class methods to perform a specific actions on the account
 * by using objects
 */
public class Bankaccount {
    
    public static void main(String[] args) {
        
        Account a = new Account ();
        
        a.getamount(12, "Ndahiro", 12234.3);
        a.deposit(9854323.44);
        a.withdraw(35544.3);
        a.checkbalance();
        a.info(2);

    }
}
