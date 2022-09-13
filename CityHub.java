class CityHub
{

	
void Area(int pincode)
 {
		
System.out.println(pincode);
	
}

	
void Area(int pincode, String police_s) 
{
		
System.out.println(pincode);

System.out.println(police_s);
	
}

	
void Area(int pincode, String police_s, String city) 
{
		
System.out.println(pincode);
		
System.out.println(police_s);
		
System.out.println(city);
	
}	

	
public static void main(String[] args)
 {
		
java.util.Scanner scan = new java.util.Scanner(System.in);
		
System.out.print("How many data you want to enter: ");

int num_data = scan.nextInt();

		
Cityhub p =  new Cityhub();

		
switch(num_data)
 {
			
case 1:
				
p.Area(400200);
				
break;
			
case 2:
				
p.Area(400200, "MP");

break;
			
case 3:
				
p.Area(400200, "MP", "Mumbai ");

break;
			
default: 
				
System.out.print("Invalid Input");

		}
	
}


}