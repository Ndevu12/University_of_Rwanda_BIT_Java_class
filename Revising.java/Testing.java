/*
 * This class initialize class instance and print their values out to the screen 
 */
class Testing{
    int tid;
    String tname;

    void readtest(int r, String t)
    {
        tid = r;
        tname = t;
    }
    void displaytest()
    {
        System.out.println(tid + " "+ tname);
    }
}

