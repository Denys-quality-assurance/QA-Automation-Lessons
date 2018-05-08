import java.util.Scanner;

public class Main {

	public static void main(String[ ] args) {
		int wrap;
		int money;
		int cost;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Количество доступных денег (Введи целое число большее 0!)");
			money = scanner.nextInt();
		} while (money<=0);
		
		do {
			System.out.println("Стоимость одной шоколадки (Введи целое число большее 0!)");
			cost = scanner.nextInt();
		} while (cost<=0);
		
		do {
			System.out.println("Количество оберток в обмен на одну шоколадку (Введи целое число большее 1!)");
			wrap = scanner.nextInt();
		} while (wrap<=1);
		
		
		HowMuchChocs.maxNumChocs(money,cost,wrap);
	}
}