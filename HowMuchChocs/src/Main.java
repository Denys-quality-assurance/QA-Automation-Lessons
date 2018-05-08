import java.util.Scanner;

public class Main {

	public static void main(String[ ] args) {
		int wrap;
		int money;
		int cost;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Quantity of available money (Enter an integer bigger 0!)");
			money = scanner.nextInt();
		} while (money<=0);
		
		do {
			System.out.println("The cost of one chocolate (Enter an integer bigger 0!)");
			cost = scanner.nextInt();
		} while (cost<=0);
		
		do {
			System.out.println("Quantity of wrappers in exchange for one chocolate (Enter an integer bigger 1!)");
			wrap = scanner.nextInt();
		} while (wrap<=1);
		
		
		HowMuchChocs.maxNumChocs(money,cost,wrap);
	}
}