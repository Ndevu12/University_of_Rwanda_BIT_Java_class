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

    }
}
