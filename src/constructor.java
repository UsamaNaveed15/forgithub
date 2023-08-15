public class constructor
{
    int Rollnum;
    String name;

    constructor()
    {
        Rollnum =21;
        name = "usama";
    }

    void show(){
        System.out.println ("Name: "+ name + " Roll Number: " + Rollnum );

    }
}
class A
{
    public  static  void main(String[] args){
    constructor ref = new constructor ();
    ref.show ();
    }
}
