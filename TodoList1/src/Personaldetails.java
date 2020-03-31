import java.util.*;
public class Personaldetails {
double phno;
String address;
int age;
Scanner scan=new Scanner(System.in);
Personaldetails(){
	System.out.println("Enter age");
	age=scan.nextInt();
	System.out.println("Enter phno");
	phno=scan.nextDouble();
	System.out.println("Enter address");
	address=scan.nextLine();
	address=scan.nextLine();
}

void print() {
	System.out.println("Age:"+age);
	System.out.println("phone no:"+phno);
	System.out.println("Address:"+address);
}
}
