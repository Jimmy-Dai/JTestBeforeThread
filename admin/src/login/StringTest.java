package login;

import java.util.Scanner;

import game.GuessNumberGame;

public class StringTest {
	public static void main(String[] args) {
		String name = "admin";
		String password = "admin";

		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������˺ţ�");
			String ad = sc.nextLine();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("���������룺");
			String pw = sc2.nextLine();

			if (ad.equals(name) && pw.equals(password)) {
				System.out.println("��½�ɹ�����ʼ��Ϸ��");
				GuessNumberGame.start();
				break;
			} else if (2 - x == 0) {
				System.out.println("���������˻�����");
			} else {
				System.out.println("�������󣬻���" + (2 - x) + "���������");
			}
		}
	}
}
