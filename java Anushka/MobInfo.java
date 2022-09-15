class MobInfo
{
	String Name;
	String Device;
	int price;

	MobInfo(String x,String y,int z)
	{
	  Name =x;
	  Device =y;
	 price= z;	
	}
	
	void ShowInfo()
	{
	System.out.println("Name:"+Name +"  "+"Degree:"+Device+"  "+"Location:"+price);

	}
	
	public static void main(String[] args)
	{
	 MobInfo  e1=new MobInfo("ANDUSHKA","VIVO",150000);
	 MobInfo  e2=new MobInfo("Spider","SONY",20000);
	 MobInfo  e3=new MobInfo("Shorty","ASUS",10000);

	 e1.ShowInfo();
	 e2.ShowInfo();
	 e3.ShowInfo();
	}
}