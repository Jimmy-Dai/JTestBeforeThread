package copyFile;

import java.io.File;

public class deleteCopy {
	public static void main(String[] args) {
		File srcF = new File("d:\\copy.flv");
		System.out.println(srcF.getName()+"---"+srcF.delete());
	}
}
