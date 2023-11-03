import Employee;
public class Employeemainclass {
    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        emp1.getdetail(1, "Ndahiro", "Yves", 784647.75, "Kigali, Kicukiro, Nyanza");
        emp2.getdetail(2,"Mugemahe","Ndagagaye", 6445654.664, "Kimihurura");
        emp3.getdetail(3, "Sinzibyaribyo", "Ndaburaye", 3345.54, "Muhanga");
        emp4.getdetail(4, "Mukundwa", "carine Heart",2344.322, "Rusizi");

        emp1.displaydetails();
        emp2.displaydetails();
        emp3.displaydetails();
        emp4.displaydetails();
}
}
