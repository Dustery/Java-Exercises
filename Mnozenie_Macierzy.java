package home_kost;

public class Mnozenie_Macierzy { //The Multiplication Of The Matrix
	public static void main(String[] args) {

		int[][] matrixA = new int [4][1];
		int[][] matrixB = new int [1][4];
		int[][] matrixC = new int [4][4];

		matrixA[0][0] = 1;
		matrixA[1][0] = 2;
		matrixA[2][0] = 3;
		matrixA[3][0] = 4;

		matrixB[0][0] = 4;
		matrixB[0][1] = 3;
		matrixB[0][2] = 2;
		matrixB[0][3] = 1;

        for (int i = 0; i < 4; i++) { // A rows
        	for (int j = 0; j < 4; j++) { // B columns
        		for (int k = 0; k < 1; k++) { // A columns
        			matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
        				System.out.print(matrixC[i][j]+ "   ");
        		}
        	}
        	System.out.println();
        }
	} //end main
} //end class
