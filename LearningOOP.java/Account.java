
/* Account - it is a class that helps in management of the Bank account information and transactions.
 * getamount: this function  get amount of money  from the account and set amount accordingly to the balance`
 *  deposit: this function get deposit amount and add it to the account balance
 * withdraw: this function deduce the amount to withdraw from the account balance
 * checkbalance: this function check the current balance of the account
 * info: this function provide information about the account: it accepts account ID as a parameter and 
 * provides informationof the account
 * If the provided account ID is not found it will return default message
 */
public class Account {
    
    int aId;
    String name;
    double amount;

    void getamount(int id, String n, double amt)
    {
           aId = id;
           name = n;
           amount = amt;
    }

    void deposit(double depo)
    {
        amount += depo;
        System.out.println(amount + " "+ "Deposited successfully");
    }

    void withdraw(double draw)
    {
        if (amount < draw)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            amount -= draw;
            System.out.println("New Balance:"+ amount +" "+"Withdrwan:"+draw);
        }
    }
     
    void checkbalance()
    {
       System.out.println("Balance:"+ amount);
    }
    void info(int idA)
    {
        if (aId == idA)
        {
             System.out.println("Account number:"+aId +" \n"+ "Name:"+name + " \n" + "Current Balance:" + amount);
        }
        else
        {
            System.out.println("Account not found");

        }
    }
}
