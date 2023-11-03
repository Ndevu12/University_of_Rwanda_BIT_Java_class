
import java.util.Scanner;
public class breakstate {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of terms for the Fibonacci series:");
    int n = scanner.nextInt();

    long a = 0, b = 1;

    System.out.print("Fibonacci Series: ");

    for (int i = 0; i < n; i++) {
        if (b > 1000){
            System.out.println("\nSorry we can't go above 1000");
            break;
        }
        System.out.print(a + " ");

        long next = a + b;
        a = b;
        b = next;

        
    }

    scanner.close();


        scanner.close();
    }
}
