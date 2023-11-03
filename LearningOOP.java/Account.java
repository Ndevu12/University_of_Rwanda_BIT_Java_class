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
