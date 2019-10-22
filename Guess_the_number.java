package RandNum;

import java.util.Random;
import javax.swing.JOptionPane;

/* Task 1
Napisa� program, kt�ry na pocz�tku wylosuje liczb� z przedzia�u od 0 do 100.
Nast�pnie program prosi, aby u�ytkownik poda� jak�� liczb�.
Je�li u�ytkownik zgadnie liczb� to wy�wietla komunikat.
*/
public class Randomos {

	public static void main(String[] args) {
		Random rand = new Random();
		int value = rand.nextInt(100);

		String input = JOptionPane.showInputDialog("What number am I thinking of?");
		int number = Integer.parseInt(input);
		
		// errors
		if (number > 100) { 
			 System.out.println("Enter the correct number!"); 
			 }
		if (number < 0) { 
			 System.out.println("Enter the correct number!"); 
			 return;
			 }
		 
		// result
		if (value != number) { System.out.println("U didn't guess the number!");
		 System.out.println("The number was: "+value);
		 } else { 
			 System.out.println("You're right: "+number+"!");
			 System.out.println("The number was: "+value); 
		 }
		System.exit(0);
	}
}
