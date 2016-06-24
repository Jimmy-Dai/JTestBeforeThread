package copyFolder;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolder {
	public static void copy(File src, File dest) {
		File[] fs = src.listFiles();
		for (File f2 : fs) {
			if (f2.isFile()) {
				File target = new File(dest.getPath() + "\\" + f2.getName());
				try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(f2));
						BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(target));) {
					byte[] bys = new byte[2048];
					int len = 0;
					while ((len = fis.read(bys)) != -1) {
						fos.write(bys, 0, len);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				File f3 = new File(dest.getPath() + "\\" + f2.getName());
				f3.mkdirs();
				copy(f2, f3);
			}
		}
	}
}