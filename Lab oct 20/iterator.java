import java.util.*;
 
public class iterator {
   
    public static void main(String[] args)
    {
        List<String> studentdetails = new LinkedList<>();
       
        studentdetails.add("Name:anushka");studentdetails.add("Div:A");
        studentdetails.add("Rollno:11");studentdetails.add("College:KMA");
        ListIterator<String> studentdetailsIterator
            = studentdetails.listIterator();
        while (studentdetailsIterator.hasNext()) {
            System.out.println(studentdetailsIterator.next());
        }
        while (studentdetailsIterator.hasPrevious()) {
            System.out.println(studentdetailsIterator.previous());
        }
    }
}