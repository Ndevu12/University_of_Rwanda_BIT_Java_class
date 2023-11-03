//package My_Own.java
import  Testing;
public class oop {
    public static void main(String[] args) {
        Testing t1 = new Testing();
        Testing t2 = new Testing();
        
        t1.readtest(102, "Nothing");
        t2.readtest(103, "Something");
        
        t1.displaytest();
        t2.displaytest();
    }
}
