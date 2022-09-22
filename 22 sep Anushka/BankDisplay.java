class Bank
{  
int getRateOfInterest()
{
return 5;
}  
}  
 
class Dena extends Bank
{  
int getRateOfInterest()
{
return 7;
}  
}  
class AmericaBCC extends Bank
{  
int getRateOfInterest()
{
return 3;
}  
}  

class BankDisplay
{  
public static void main(String args[])
{  
Dena b=new SBI();  
AmericaBCC c=new AXIS();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+c.getRateOfInterest());  
}  
}			