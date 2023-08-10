import java.util.Scanner;

//Write a program to print the area of a rectangle
public class AreaofRectangle {
        public  static  void main (String[] args) {

            double length;
            double breadth;
            double area;

            Scanner keyboard = new Scanner ( System.in );

            System.out.print ("Enter the Length of Rectangle:");
            length = keyboard.nextDouble ();

            System.out.print ("Enter the Breadth of Rectangle:");
            breadth = keyboard.nextDouble ();

            area = length * breadth;

            System.out.println ("Area of Rectangle: "+ area);

        }
}

