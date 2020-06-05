import java.util.*;
import java.text.*;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws Exception {
	int choice,n,j;
	int i=0;
	String sname; //search name
	Scanner scan=new Scanner(System.in);
	User[] user=new User[10];
	Alldates al=new Alldates();
	// al.compare();
    while(true) {
		System.out.println("Enter choice 1.add user and todo 2.search for particular user todo 3.add more todos to a particular user list 4.mark complete");
		choice=scan.nextInt();
		switch(choice) {
		case 1:
			try {
			user[i]=new User();
			}catch( NoNumberException ne) {
				System.out.println(ne);
			}
			i++;
			break;
		case 2:
			System.out.println("Enter name");
			sname=scan.nextLine();
			sname=scan.nextLine();
			for(j=0;j<i;j++) {
				if(sname.contentEquals(user[j].name)) {
					user[j].disp();
				}
			}
			break;
		case 3:
			System.out.println("Enter name");
			sname=scan.nextLine();
			sname=scan.nextLine();
			for(j=0;j<i;j++) {
				if(sname.contentEquals(user[j].name)) {
					user[j].insert();
				} 
			}
			break;
		case 4:
			System.out.println("Enter name");
			sname=scan.nextLine();
			sname=scan.nextLine();
			for(j=0;j<i;j++) {
				if(sname.contentEquals(user[j].name)) {
					user[j].searchuser();
				}
			}
			
	}
	}
}
}
