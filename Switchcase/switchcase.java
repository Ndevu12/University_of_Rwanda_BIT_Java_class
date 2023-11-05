/* This program accept a number corresponding to the month and 
* when the number is less than or equal to 0 and the number is greater than 12,
* The user is asked to re-enter the number again
* after it display the name of the month  represented by the number
* deafault: it will dissplay deafault message to the user 
*/
import java.util.Scanner;

public class switchcase{
    public static void main(String [] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number corresponding to month");
        int month = scanner.nextInt();

        while (month <= 0 || month > 12 ){
            System.out.println("Re-Enter: month must be between 1 and 12");  
        }

        switch(month){
            case 1:
            System.out.println("January");
            break;

            case 2:
            System.out.println("February");
            break;

            case 3:
            System.out.println("March");
            break;

            case 4:
            System.out.println("April");
            break;

            case 5:
            System.out.println("May");
            break;

            case 6:
            System.out.println("June");
            break;

            case 7:
            System.out.println("July");
            break;

            case 8:
            System.out.println("Augaste");
            break;

            case 9:
            System.out.println("September");
            break;

            case 10:
            System.out.println("October");
            break;

            case 11:
            System.out.println("November");
            break;

            case 12:
            System.out.println("December");
            break;

            default:
            System.out.println("Wrong input");
            

        }
        scanner.close();
    }
}