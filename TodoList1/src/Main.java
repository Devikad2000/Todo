import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
	int choice,n,j;
	int i=0;
	String sname; //search name
	Scanner scan=new Scanner(System.in);
	User[] user=new User[10];
    while(true) {
		System.out.println("Enter choice 1.add user and todo 2.search for particular user todo 3.add more todos to a particular user list");
		choice=scan.nextInt();
		switch(choice) {
		case 1:
			user[i]=new User();
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
