package home_kost;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomeKost { // JOptionPane.showInputDialog + switch

	public static void main(String[] args) {

		JFrame frame = new JFrame("InputOption");
		String option = JOptionPane.showInputDialog
				(frame, "Select option: 1, 2, 3, 4");
		int choose = Integer.parseInt(option);
		switch (choose) {
		case 1:
			System.out.printf("You choose option '1'.\n", option);
			break;
		case 2:
			System.out.printf("You choose option '2'.\n", option);
			break;
		case 3:
			System.out.printf("You choose option '3'.\n", option);
			break;
		case 4:
			System.out.printf("You choose option '4'.\n", option);
			break;
		default:
			System.out.printf("You did not choose any options.\n", option);
			break;
		} // end switch
	} // end main
} // end class
