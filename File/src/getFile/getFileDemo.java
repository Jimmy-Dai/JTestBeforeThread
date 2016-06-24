package getFile;

import java.util.Scanner;

public class getFileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String src = sc.nextLine();
		GetFile.find(src);
		//GetFile.filesNum();
		sc.close();
	}
}
