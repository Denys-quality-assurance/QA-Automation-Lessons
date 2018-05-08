import java.util.Random;
import java.util.Scanner;

class Game {
  public static void main(String[ ] args) {
	
	int a = 0;
	int b = 9;
	int  random_number = a + (int) (Math.random ()*b);
	int myVar = 10;
	
	System.out.println("Enter an integer from 0 to 9");
	Scanner Var = new Scanner(System.in);
	 
	while (Var.hasNextInt()) {
	    myVar = Var.nextInt();
	    if (myVar == random_number) {
	    System.out.println("OK! Has got!");
		} else if (myVar > random_number) {
		System.out.println("Enter the value less!");
	    } else if (myVar < random_number) {
		System.out.println("Enter a value more!");
	  }
  }
  
  
}
}