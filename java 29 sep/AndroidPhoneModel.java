public class AndroidPhoneModel
 {  	  
	 String name;
	 int ram;
	 String colour;
	 String display;
	 
	 public AndroidPhone(String name, int ram, String colour,String display) 
	 {
	        this.name = name;
	        this.ram = ram;
	        this.colour = colour;
			this.display=display;
 }
	 public String toString() 
	 {
		 return "AndroidPhone [name=" + ram + " , colour=" +colour + "]";
	 }
	 


}