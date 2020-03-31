import java.util.*;
public class Main {
	public static void main(String[] args) {
	int ch,n,j;
	int i=0;
	String word;
	Scanner scan=new Scanner(System.in);
	User[] u=new User[10];
	while(true) {
		System.out.println("Enter choice");
		ch=scan.nextInt();
		switch(ch) {
		case 1:
			u[i]=new User();
			i++;
			break;
		case 2:
			System.out.println("Enter name");
			word=scan.nextLine();
			word=scan.nextLine();
			for(j=0;j<i;j++) {
				if(word.contentEquals(u[j].name)) {
					u[j].disp();
				}
			}
			break;
		case 3:
			System.out.println("Enter name");
			word=scan.nextLine();
			word=scan.nextLine();
			for(j=0;j<i;j++) {
				if(word.contentEquals(u[j].name)) {
					u[j].insert();
				}
			}
			break;
			
	}
	}
}
}
