import java.util.*;
public class User {
	int n,i,m;
String name;
static int uid=0;
 Scanner scan=new Scanner(System.in);
 Todo[] todo;
 User(){
	 uid++;
	 System.out.println("Enter name");
	 name=scan.nextLine();
	 System.out.println("Enter number of todos");
	 n=scan.nextInt();
	 todo=new Todo[n];
	 for(i=0;i<n;i++) {
		 todo[i]=new Todo();
	 }
 }
 void disp() {
	 System.out.println(name);
	 System.out.println(uid);
	 for(i=0;i<n;i++) {
		 System.out.println(n);
		 todo[i].display();
	 }
 }
 void insert() {
	 System.out.println("Enter number of todos");
	 n=scan.nextInt();
	 todo=new Todo[n];
	 for(i=0;i<n;i++) {
		 todo[i]=new Todo();
	 }
	 n=m+n;
	 System.out.println(n);
 }
}
