//Write a Java program to create a class called Employee with methods called work() and getSalary().
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

public class InhertanceEmployee {
    public  static  void main(String[] args){
        Employee emp = new Employee ();
        HRManageer HR =new HRManageer ();

        emp.work ();
        System.out.println ("Employee has salary: "+ emp.getSalary ());
        HR.work ();
        HR.addEmployee ();

    }
}
class Employee{
    double salary = 50000;

    public  void work(){
        System.out.println ("Work Class working employees");
    }

    public  Double getSalary(){
        return salary;

    }
}

class HRManageer extends Employee{
    public void work(){
        System.out.println ("HR Working Side");
    }

    public void addEmployee(){
        System.out.println ("HR is for adding employees");
    }
}
