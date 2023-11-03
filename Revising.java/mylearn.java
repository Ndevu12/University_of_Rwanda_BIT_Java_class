import java.util.Scanner;
 
public class mylearn{
  
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
          
        String s = new String("nothing to compare");
        String t = new String("Nothing to compare");
        boolean tr = s.equals(t);;
        System.out.println(tr);
    }
}