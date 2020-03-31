import java.util.*;
public class Todo {
int id;
String description;
Scanner scan=new Scanner(System.in);
ArrayList<String> arlist=new ArrayList<String>();   
Todo(){
	System.out.println("Enter description");
    arlist.add(scan.nextLine()); 
}

void display() {
	System.out.println(arlist);
}

}
