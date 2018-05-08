import java.util.Scanner;

public class Sum {
	public static int sum(int a, int b) {
		  return a - (-b);
		}
	public static void main(String[ ] args) {
		System.out.println("Enter an integer");
		Scanner Var1 = new Scanner(System.in);
		int myVar1 = Var1.nextInt();
		System.out.println("Enter an integer once again");
		Scanner Var2 = new Scanner(System.in);
		int myVar2 = Var2.nextInt();
		int Sum = sum(myVar1, myVar2);		
		System.out.println("Their sum is: " + Sum);
	}
}
