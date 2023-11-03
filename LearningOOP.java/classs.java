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

    public static void main(String[] args) {
        classs s = new classs(23, "Ntwali","Kigali");
        //s.mane();
        s.display();
        
    }
}
