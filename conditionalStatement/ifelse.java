import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Ally, Damour, Vedaste,Danny, RedBoy;
        System.out.println("Let us call Five boys, and ask them to enter their ages for the purpose of evaluating the oldest among them"); 
        
        System.out.println("Ally Enter oyur age");
        Ally = scanner.nextInt();
       
        System.out.println("Damour Enter oyur age");
        Damour = scanner.nextInt(); 
    
        System.out.println("Vedaste Enter oyur age");
        Vedaste = scanner.nextInt();
        
        System.out.println("Danny Enter oyur age");
        Danny = scanner.nextInt(); 

        System.out.println("RedBoy Enter oyur age");
        RedBoy = scanner.nextInt(); 
        System.out.println("\n------------------------------------------------\n");
       
        System.out.println("Ally is "+ Ally); 
        System.out.println("Damour is "+ Damour); 
        System.out.println("Vedaste is "+ Vedaste);
        System.out.println("Danny is "+ Danny);
        System.out.println("RedBoy is "+ RedBoy);

        System.out.println("\n------------------------------------------------\n");

       if (Ally == Damour && Ally == Vedaste && Ally == Danny && Ally == RedBoy){
            System.out.println("All are equal in age");
         }
         if (Ally > Damour && Ally > Vedaste && Ally > Danny && Ally > RedBoy){
            System.out.println("Ally is older than all"); 
        }
        else if (Damour > Ally  &&  Damour > Vedaste && Damour > Danny && Damour > RedBoy) {
            System.out.println("Damour is older");
        }
        else if (Vedaste > Ally && Vedaste > Damour && Vedaste > Danny && Vedaste > RedBoy) {
            System.out.println("Vedaste is older");
        }
        else if ((Danny > Ally) && (Danny > Damour) && (Danny > Vedaste) && (Danny > RedBoy)) {
          System.out.println("Danny is older");
        }
        else if (RedBoy> Ally && RedBoy > Damour && RedBoy> Vedaste && RedBoy > Danny) {
            System.out.println("RedBoy is older");
        }
        else{
           
            System.out.println("Some has the same ages");
            }    
        
     System.out.println("\n");       
        
        scanner.close(); 
    }
}

