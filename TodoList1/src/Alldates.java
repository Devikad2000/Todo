import java.text.*;
import java.util.*;
public class Alldates {
	Scanner scan=new Scanner(System.in);
    SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
    Date dNow=new Date();
	String d;
	Alldates(){
    System.out.println("Current Date: " + ft.format(dNow));
}
	
	void compare() throws Exception {
		System.out.println("Enter due date int the format: dd-MM-yyyy");
		 SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
	      Date d1 = sdformat.parse(scan.nextLine());
	      System.out.println("The date 1 is: " + sdformat.format(d1));
	      if(d1.compareTo(dNow) > 0) {
	         System.out.println("Due date not reached");
	      } else if(d1.compareTo(dNow) < 0) {
	         System.out.println("Invalid Date");
	      } else if(d1.compareTo(dNow) == 0) {
	         System.out.println("Today is the last day");
	      }	
	}
}


