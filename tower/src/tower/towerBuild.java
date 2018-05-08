package tower;

import java.util.Scanner;

public class towerBuild {
	public static void main(String[ ] args) {
		System.out.println("Enter the reasonable number of floors of a tower");
		Scanner Var = new Scanner(System.in);
		int myVar = Var.nextInt();
		
		
		
		for (int j = 0; j<myVar; j++) {
		for (int i = 0; i<myVar-(1+j); i++) {
			System.out.print(" ");
		}
		for (int i = 0; i<2+j; i++) {
			System.out.print("#");
		}
		System.out.print(" ");
		for (int i = 0; i<2+j; i++) {
			System.out.print("#");
		}
		for (int i = 0; i<myVar-(1+j); i++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	}
}
