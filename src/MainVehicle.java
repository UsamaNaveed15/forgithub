//Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".

public class MainVehicle {
    public static  void main(String[] args){
        vehicle v = new vehicle ();
        car c= new car ();
        v.drive ();
        c.drive ();


    }
}

class vehicle{
    public void drive(){
        System.out.println ("Vehicle Class");
    }
}

class car extends vehicle{
    @Override
    public void drive(){
        System.out.println ("Driving a car");
    }
}
