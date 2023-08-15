public class hierarchicalInheritance {
    public static void main(String[] args){
        baseclass bc = new baseclass ();
        childclass1 c1 = new childclass1 ();
        childclass2 c2 = new childclass2 ();
        bc.Baseclass ();
        c1.Childclass1 ();
        c2.Childclass2 ();


    }
}
class baseclass{
    public void Baseclass(){
        System.out.println ("Base Class");
    }
}

class childclass1 extends baseclass{
    public void Childclass1(){
        System.out.println ("Child class 1 inhert from base class");
    }
}
class childclass2 extends  baseclass{
    public  void Childclass2(){
        System.out.println ("Child class 2 inherit with base class");

    }
}
