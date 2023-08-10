//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
public class Student {
    private String name;
    private  int roll_no;

    public  static  void main( String[] args){

        Student s = new Student ();
        s.name = "usama";
        s.roll_no = 2;

        System.out.println ("Name: " + s.name + "\nRoll Number: " + s.roll_no);

    }
}
