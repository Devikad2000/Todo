import java.util.*;
public class User {
	int n,i,m;
String name;
static int uid=0;
 Scanner scan=new Scanner(System.in);
 Todo[] todo=new Todo[10];
 User(){
	 uid++;
	 System.out.println("Enter name");
	 name=scan.nextLine();
	 System.out.println("Enter number of todos");
	 n=scan.nextInt();
	 for(i=0;i<n;i++) {
		 todo[i]=new Todo();
	 }
 }
 void disp() {
	 System.out.println("Name:"+name);
	 System.out.println("User id:"+uid);
	 for(i=0;i<n;i++) {
		 todo[i].display();
	 }
 }
 void insert() {
	 System.out.println("Enter number of todos");
	 m=scan.nextInt();
	 for(i=n;i<n+m;i++) {
		 todo[i]=new Todo();
	 }
	 n=m+n;
 }
}
