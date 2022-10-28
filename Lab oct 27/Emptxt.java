import java.io.FileWriter;
import java.io.IOException;

public class Emptxt {
  public static void main(String[] args) {
    try {
      int eid=123; String ename = "anushka"; int sal= 123 ;
      FileWriter myWriter = new FileWriter("emp.txt");
      myWriter.write("Emp Details- ID:"+ eid + ", Name:"+ename+", Salary:"+sal);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}