package com.company;

/*Task
To sort the point coordinates according 
to the X-coordinate from smaller to bigger.*/

public class Point {

	public static void main(String[] args) {
		int [] x = {1, 0, 2, 3, 1};
		int [] y = {2, 3, 1, 8, 3};
		for(int i = 0; i < x.length; i++) {
			int imin = i;
			for(int j = i+1; j < x.length; j++) {
				if(x[j] < x[imin]) imin = j;
			}
			int tmp = x[i];
			x[i] = x[imin];
			x [imin] = tmp;
			
			tmp = y[i];
			y[i] = y[imin];
			y[imin] = tmp;
		}
		for (int i = 0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		for (int i = 0; i<y.length; i++) {
			System.out.print(y[i] + " ");
		}
	}
}
