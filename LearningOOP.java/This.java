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
