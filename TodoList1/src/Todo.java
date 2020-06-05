import java.util.*;
public class Todo {
int id=0;
String description;
String title;
String word="shop";
int i=0;
int n=0;
Scanner scan=new Scanner(System.in);
//ArrayList<String> arlist=new ArrayList<String>();   
String a[]=new String[3];
String t;
String yes="y";
Todo(){
	id++;
	n++;
	

	//System.out.println("Enter title");
	//title=scan.nextLine();
	System.out.println("Enter description");
  //  arlist.add(scan.nextLine()); 
    a[id-1]=scan.nextLine();
}

void display() {
	//System.out.println(arlist);  
	if(i<n) {
		System.out.println(a[i]);
	}
	i++;
}

void searchtodo(String x) {
		if(x.contentEquals(a[i])) {
			System.out.println(a[i]);
			System.out.println("Is the task complete y or n");
			t=scan.nextLine();
			if(t.contentEquals(yes)) {
				a[i]=" ";
			}
			/* if(i<n) {
				System.out.println(a[i]);
			} */
		}
}

}
