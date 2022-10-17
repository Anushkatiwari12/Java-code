package userdefinedexeception;

public class Run{
    public static void main(String args[])
    {
        
        try {
            throw new AException("this is an exception");
        }
        catch (AException a) {
            System.out.println("Occured");
            System.out.println(a.getMessage());
        }
    }
}