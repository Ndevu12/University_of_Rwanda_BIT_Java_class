/*This class read and display employee information 
 * getdetail: This method initialize employee instance
 * displaydetails: this method display employee information
*/
public class Employee {

   int empid;
   String fname;
   String lname;
   double salary;
   String address;
   
   void getdetail(int id, String n1, String n2, double  t, String ad)
   {
    empid = id;
    fname =n1;
    lname = n2;
    salary = t;
    address = ad;
   }
   void displaydetails()
   {
    System.out.println("\t" + empid +"\t"+ fname + "\t"+ lname + "\t"+ salary +"\t"+ address);
   }
   
}
