package prakt;

public class Operator_Inkrementacji {

	public static void main(String[] args) {

		int x = 1, y;
		System.out.println("Wynik 1 = " + ++x);
		System.out.println("Wynik 2 = " + x++);
		System.out.println("Wynik 3 = " + x);
		y = x++;
		System.out.println("Wynik y1 = " +y);
		y = ++x;
		System.out.println("Wynik y2 = " + ++y);


	}
}
