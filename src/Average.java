import java.util.Scanner;

//Print the average of three numbers entered by user by creating a class named 'Average'.
public class Average {
    public static void main(String[] args){

        float num1, num2, num3, sum, average;

        Scanner keyboard = new Scanner ( System.in );

        System.out.print ( "Enter the value of First number: " );
        num1 = keyboard.nextFloat ();

        System.out.print ("Enter the value of Second number: ");
        num2 = keyboard.nextFloat ();

        System.out.print ( "Enter the valur of Third Number: " );
        num3 = keyboard.nextFloat ();

        sum = num1+num2+num3;
        average = sum/3;

        System.out.println ("The Average of 3 numbers is: " + average);

    }

}
