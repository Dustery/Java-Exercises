package task1;
/*
Task
A certain number of people shake hands.
They don't shake hands with themselves, 
and they don't shake hands with someone they've already.
How many handshakes they make.
*/
import java.util.Scanner;
public class BookTask {

	public static void main(String[] args) {
		
		 Scanner peopleNumber = new Scanner(System.in);
		 System.out.print("Number of people: ");
		 int a = peopleNumber.nextInt();
		 peopleNumber.close();
		 int b = a*a; // handshakes
		 int c = b-a; // delete handshakes with the same people
		 int d = c/2; // delete handshakes with himself

		 System.out.println("Number of handshakes: "+c);
		 System.out.println("Number of handshakes without the same people: "+d);
		 
	}
}
