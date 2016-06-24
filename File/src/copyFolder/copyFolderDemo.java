package copyFolder;

import java.io.File;

public class copyFolderDemo {
	public static void main(String[] args) {
		// File s1 = new File("d:\\demp");
		// File s2 = new File("e:\\");
		String s1 = "d:\\demp";
		String s2 = "e:\\ak";

		CopyFolder.copy(new File(s1), new File(s2));
	}
}
