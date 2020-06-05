import java.util.*;
public class User {
	int n,i,m;
String name;
String stodo;
static int uid=0;
 Scanner scan=new Scanner(System.in);
 Todo[] todo=new Todo[10];
 Todo t;
 Personaldetails pd;
 User() throws NoNumberException{
	 uid++;
	 System.out.println("Enter name");
	 name=scan.nextLine();
	 if(checkletter()==false) {
		 throw new NoNumberException();
	 }
	 try {
	 pd=new Personaldetails();
	 }catch(InvalidLengthException e) {
		 System.out.println(e);
	 }
	 System.out.println("Enter number of todos");
	 n=scan.nextInt();
	 for(i=0;i<n;i++) {
		 todo[i]=new Todo();
	 }
 }
 void disp() {
	 System.out.println("Name:" + name);
	 System.out.println("User id:"+uid);
	 pd.print();
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
 
 void searchuser() {
	 System.out.println("Enter todo");
		stodo=scan.nextLine();
		stodo=scan.nextLine();
	 for(i=0;i<n;i++) {
		 System.out.println("1");
		 todo[i].searchtodo(stodo);
	 }
 }
 
 public boolean checkletter() {
	 for(i=0;i<name.length();i++) {
		 char ch=name.charAt(i);
		 if((!(ch >= 'A' && ch <= 'Z')) && (!(ch >= 'a' && ch <= 'z')))
			 return false;
	 }
	 return true;
 }
}
