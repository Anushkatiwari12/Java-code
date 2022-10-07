package bank;

public class Intrest{
    public static void main(String args[])
    {
        Icici icici = new Icici();
        SBI state = new SBI();
        AXIS axis = new AXIS();
        System.out.println("Rate of Intrest in UBI is "+icici.roi()+"%");
        System.out.println("Rate of Intrest in SBI is "+state.roi()+"%");
        System.out.println("Rate of Intrest in AXIS is "+axis.roi()+"%");
    }  
}