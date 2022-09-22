class A 
{
   void funcA()
   {
      System.out.println("Multilevel");
   }
}
class B extends A 
{
   void funcB() 
   {
      System.out.println("Hierrachial");
   }
}

class C extends B 
{
   void funcC() 
   {
      System.out.println("Multilevel");
   }
}
public class InheritanceTypes
{
public static void main(String args[]) 
{
      C obj = new C();
      obj.funcA();
      obj.funcB();
      obj.funcC();
   }
}




