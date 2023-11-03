
import java.util.Scanner;
public class whileloop {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Please enter a number you want to see its timestable");
        n = scanner.nextInt();

        while (n < 0)
        {
            System.out.println("Re-enter: number must be equal or greater than 0.");
            n = scanner.nextInt();
        }
        int i = 0;
        while (i <= 10){
            System.out.println(n +" "+"*"+" "+ i +" "+" = "+ i*n);
            i++;
        }
    }
}
