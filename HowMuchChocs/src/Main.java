import java.util.Scanner;

public class Main {

	public static void main(String[ ] args) {
		int wrap;
		int money;
		int cost;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("���������� ��������� ����� (����� ����� ����� ������� 0!)");
			money = scanner.nextInt();
		} while (money<=0);
		
		do {
			System.out.println("��������� ����� ��������� (����� ����� ����� ������� 0!)");
			cost = scanner.nextInt();
		} while (cost<=0);
		
		do {
			System.out.println("���������� ������� � ����� �� ���� ��������� (����� ����� ����� ������� 1!)");
			wrap = scanner.nextInt();
		} while (wrap<=1);
		
		
		HowMuchChocs.maxNumChocs(money,cost,wrap);
	}
}