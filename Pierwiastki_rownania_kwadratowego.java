package prakt;

public class Pierwiastki_rownania_kwadratowego { //Quadratic equation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int A=1, B=-1, C=-6;
		System.out.println("Parametry równania: ");
		System.out.println("A: " +A+ ", B: " +B+ ", C: " +C);
		
		if (A == 0) {
			System.out.println("To nie jest równanie kwadratowe: A =! 0");
		}
		else {
			double delta = B*B-4*A*C;
			if (delta < 0) {
				System.out.println("Delta < 0.");
				System.out.println("To równanie nie ma rozwiązania w "
						+ "zbiorze liczb rzeczywistych");
			}// if delta < 0
			
			else {
				double wynik;
				if (delta == 0) {
					wynik = -B / 2*A;
					System.out.println("Rozwiązanie: x = " +wynik);
				} //if delta == 0
				else {
					wynik = (-B + Math.sqrt(delta)) / 2*A;
					System.out.print("Rozwiązanie: x1 = " +wynik);
					wynik = (-B - Math.sqrt(delta)) / 2*A;
					System.out.print(", x2 = " +wynik);
				} //third else
			} // second else
		} //first else
		
	} //end main
} //end class
