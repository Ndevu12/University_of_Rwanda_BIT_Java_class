
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
            
            System.out.println(interest);

        }

        public static void main(String[] args) {
            
            Compound s= new Compound();
            s.getamount(3,0.18, 500000, 12);
            s.calculation();
        }
    


}