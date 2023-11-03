

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java is awesome!";
        
        // Concatenation
        String result = str1 + " " + str2;
        System.out.println(result);

        // String length
        int length = result.length();
        System.out.println("Length of the string: " + length);

        // Accessing characters
        char firstChar = result.charAt(0);
        char lastChar = result.charAt(length - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // String comparison
        boolean areEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + areEqual);

        // Substring
        String sub = result.substring(0, 5);
        System.out.println("Substring: " + sub);

        // Searching
        int index = result.indexOf("awesome");
        System.out.println("Index of 'awesome': " + index);
    }
}
