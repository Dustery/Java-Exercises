package exchange;

import javax.swing.JOptionPane;

/* Task 2
Napisz program do wydawania reszty z automatu. Maj�c do dyspozycji monety i 
banknoty w nomina�ach: 100z�, 50z�, 20z�, 10z�, 5z�, 2z�, 1z�, napisz program, 
kt�ry dla podanej kwoty w z�otych (bez groszy) rozmieni podan� kwot� 
pieni�dzy (int) przez u�ytkownika na nomina�y do wydania.
*/

public class Amount {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Your amount?");
		int number = Integer.parseInt(input);
		
		int hundred = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		
		while (number >= 100) {
			number = number - 100;
			hundred++;
			continue;
		}
		while (number >= 50) {
			number = number - 50;
			fifty++;
			continue;
		}
		while (number >= 20) {
			number = number - 20;
			twenty++;
			continue;
		}
		while(number >= 10) {
			number = number - 10;
			ten++;
			continue;
		}
		while (number >= 5) {
			number = number - 5;
			five++;
			continue;
		}
		while(number >= 2) {
			number = number - 2;
			two++;
			continue;
		}
		while(number >= 1) {
			number = number - 1;
			one++;
			continue;
		}
		
		System.out.println("Result:");
		System.out.println("100zl = "+hundred);
		System.out.println("50zl = "+fifty);
		System.out.println("20zl = "+twenty);
		System.out.println("10zl = "+ten);
		System.out.println("5zl = "+five);
		System.out.println("2zl = "+two);
		System.out.println("1zl = "+one);

	}
}
