/*Classs - this class gets the personal information and dispal them
 * classs: This constructor is used to initialize the class instance
 * display: this method is used to display the personal information
 */
public class classs {
    
    int age;
    String name;
    String address;
    
    classs (int age, String name, String address)
    {
    this.age = age;    
    this.name = name;
    this.address = address;
    }
    void display()
    {
        System.out.println(age  + " " + name + " " + address);
    }

/*Calling classs object with main method */
    public static void main(String[] args) {
        classs s = new classs(23, "Ntwali","Kigali");
        //s.mane();
        s.display();
        
    }
}
