/* This simple program aimed at getting familiar with this keyword 
 * by calling constructor methods
*/
public class This {
    void testingThis(This o)
    {
        System.out.println("This is tested");
    }
    void See()
    {
        testingThis(this);
    }

    public static void main(String[] args) {
        This t = new This();
        t.See();
    }
}
