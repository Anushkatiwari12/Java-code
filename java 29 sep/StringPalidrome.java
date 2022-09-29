import java.util.Scanner;
public class StringPalidrome{
	
	public static void main(String args[])
	{
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter a String");
		String write = sc.nextLine();
		ac.close();
		
		String rev = (new StringBuilder(write)).reverse().toString();
		if (write.equals(rev))
		{
			System.out.println(write.toUpperCase() + " String is Palidrome");
		}
		
		else
		{
			System.out.println(write.toUpperCase() + " String is not Palidrome");
		}
	}

}
