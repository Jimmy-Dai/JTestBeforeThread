package game;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		int number = (int) (Math.random() * 100) + 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ҫ�µ����֣�");
			int guess = sc.nextInt();

			if (number > guess) {
				System.out.println("��µ�����" + guess + "С��");

			} else if (number < guess) {
				System.out.println("��µ�����" + guess + "����");

			} else {
				System.out.println("��ϲ�������");
				break;

			}
		}
	}
}
