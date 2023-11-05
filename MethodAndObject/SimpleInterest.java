/*This program calculates simple interest 
 * getamount: this methods initialize  the instance variables of the simpleInterest class
 * calculation: this method calculates the the simple interest
 * and prints the result to the screen
 * main: this method calls class's method using objects
*/
public class SimpleInterest {
    
        int year;
        double rate;
        long  principle;
        
    
        void getamount(int y, double r,   long p)
        {
    
            year = y;
            rate = r;
            principle = p;
        }
        void calculation()
            {
                double interest = year * principle * rate;
                System.out.println("simple interest of Mr.Bob after 5 years is "+interest);
    
            }
    
            public static void main(String[] args) {
                
                SimpleInterest s= new SimpleInterest();
                s.getamount(5,0.05, 100000);
                s.calculation();
            }
        
    
    
    } 

