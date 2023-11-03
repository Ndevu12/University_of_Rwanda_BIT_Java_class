import java.util.Scanner;

public class ReadValueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();
        System.out.println("You entered: " + value);
        scanner.close(); // Close the scanner when done
    }
}

