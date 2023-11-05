/*This program calculates compound interest 
 * getamount: this methods initialize  the instance variables of the compound class
 * calculation: this method calculates the the compound interest
 * and prints the result to the screen
 * main: this method calls class's method using objects
*/
import java.lang.Math;

public class Compound{
    int time;
    double rate;
    long  principle;
    int n;
    

    void getamount(int y, double r,   long p, int m)
    {

        time = y;
        rate = r;
        principle = p;
        n = m;
    }
    void calculation()
        {
            double interest = principle*Math.pow( 1 + rate/n,n*time);
            
            System.out.println("Compound interest of Mr.Bob after 3 years is "+interest);

        }

        public static void main(String[] args) {
            
            Compound s= new Compound();
            s.getamount(3,0.18, 500000, 12);
            s.calculation();
        }
    


}