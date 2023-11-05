/* This simple program use while loop to calculate times table
* It use while loop to get the number of times table from the user, when it is less than 0 it ask a user again to re-enter the value
 * Also while loop used to print out the times table to the screen
 */
import java.util.Scanner;

public class dowhile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int i = 0 , n;

       do{
        System.out.println("Enter a number for times table");
        n = scanner.nextInt();
       }
       while (n < 0);

       do
        {
            System.out.println(n +" "+"*"+" "+ i +" "+" = "+ i*n);
            i++;
        }while (i <= 10);  
    scanner.close();
    }

}
