// A inherit with b and b inherit with c
public class MultiLevelInheritence {
    public  static  void  main(String[] args){
            son s = new son ();
            s.house ();
            s.Apartment ();
            s.renthouse ();

    }
}
class grandfather{
    public void house(){
        System.out.println ("\n Grandfather has big house A big house. ");
    }
}

class father extends grandfather{
    public void Apartment(){
        System.out.println ("\n Father has apartment.");
    }
}

class son extends father{
    public  void renthouse(){
        System.out.println ("\n Son his on rent house.");
    }
}