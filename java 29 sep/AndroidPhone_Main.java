public class AndroidPhone_Main 
{
		public static void main(String args[])
		{
	    	
	    AndroidPhoneModel a1 = new AndroidPhoneModel("KAu", 8, "red");
        AndroidPhoneModel a2 = new AndroidPhoneModel("REdmi", 4, "blue");
        AndroidPhoneModel a3 = new AndroidPhoneModel("Oppo", 6, "grey");
        
        AndroidPhoneModel[] arr = new AndroidPhoneModel[3];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        for(AndroidPhone a: arr);
        {	
			System.out.println(a.name + " " a.ram + " " a.colour);
        }
	    }
}