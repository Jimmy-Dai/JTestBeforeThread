package login;

import java.util.Scanner;

import game.GuessNumberGame;

public class StringTest {
	public static void main(String[] args) {
		String name = "admin";
		String password = "admin";

		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入账号：");
			String ad = sc.nextLine();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("请输入密码：");
			String pw = sc2.nextLine();

			if (ad.equals(name) && pw.equals(password)) {
				System.out.println("登陆成功，开始游戏。");
				GuessNumberGame.start();
				break;
			} else if (2 - x == 0) {
				System.out.println("输入有误，账户冻结");
			} else {
				System.out.println("输入有误，还有" + (2 - x) + "次输入机会");
			}
		}
	}
}
