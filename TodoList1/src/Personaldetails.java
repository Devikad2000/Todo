import java.util.*;
public class Personaldetails {
String phno;
String address;
int age;
Scanner scan=new Scanner(System.in);
Personaldetails() throws InvalidLengthException {
	System.out.println("Enter age");
	age=scan.nextInt();
	System.out.println("Enter phno");
	phno=scan.nextLine();
	phno=scan.nextLine();
	if(phno.length()>10 || phno.length()<10)
		{
		throw new InvalidLengthException();
		}
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
