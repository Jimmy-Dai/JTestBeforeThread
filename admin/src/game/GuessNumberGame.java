package game;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		int number = (int) (Math.random() * 100) + 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("输入你要猜的数字：");
			int guess = sc.nextInt();

			if (number > guess) {
				System.out.println("你猜的数字" + guess + "小了");

			} else if (number < guess) {
				System.out.println("你猜的数字" + guess + "大了");

			} else {
				System.out.println("恭喜你猜中了");
				break;

			}
		}
	}
}
