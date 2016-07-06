package RenameTo;

import java.util.Scanner;

public class RenameToDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		GetFile.find(line);
		sc.close();
		System.out.println("Íê±Ï");

	}

}
