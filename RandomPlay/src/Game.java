import java.util.Random;
import java.util.Scanner;

class Game {
  public static void main(String[ ] args) {
	
	int a = 0;
	int b = 9;
	int  random_number = a + (int) (Math.random ()*b);
	int myVar = 10;
	
	System.out.println("����� �� 0 �� 9");
	Scanner Var = new Scanner(System.in);
	 
	while (Var.hasNextInt()) {
	    myVar = Var.nextInt();
	    if (myVar == random_number) {
	    System.out.println("OK! �����!");
		} else if (myVar > random_number) {
		System.out.println("����� �������� ������!");
	    } else if (myVar < random_number) {
		System.out.println("����� �������� ������!");
	  }
  }
  
  
}
}