package road;

public class Testclass {
    public static void main(String[] args){
        Road rd;
        rd=new Highway();
        Highway hy;
        hy=new Highway();
        Oldroad od;
        od=new Oldroad();

        rd.SetStyle(new Car());
        hy.way();
        rd.ride();

        rd=new Oldroad();

        rd.SetStyle(new Car());
        od.way();
        rd.ride();

        rd.SetStyle(new Bike());
        rd.ride();
    }
}
