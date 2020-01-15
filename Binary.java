package logbin;

public class BinaryWork {

	public static void main(String[] args) {

		int p = 03333, p1; //octal
		int q = 01111; //octal
		int r;
		short s;
		r=p&q; // AND
		System.out.printf("%8o \n", r);
		r=p|q; // OR
		System.out.printf("%8o \n", r);
		r=p^q; // XOR
		System.out.printf("%8o \n", r);

		//HEX
		p=0xAAAAAAAA;
		q=0x0FFF;
		System.out.printf("%8x \n", p);
		System.out.printf("%8x \n", q);
		r=p&q; //AND
		System.out.printf("%8x \n", r);
		r=p^q; //XOR
		System.out.printf("%8x \n", r);

		// integer to binary
		int ii = 15;
		String bb=Integer.toBinaryString(ii); //integer to binary
		System.out.println(bb);
		System.out.println(Integer.toBinaryString(255));

		//print
		int y = 20;
		System.out.printf("Liczba osemkowa       %5o \n", y); // Octal number
		System.out.printf("Liczba szesnastkowa  %6x \n", y); // Hexadecimal number
		System.out.printf("Liczba dziesietna    %6d \n", y); // Decimal number
	} // end class
} // end main
