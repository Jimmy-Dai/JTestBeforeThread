package RenameToSingle;

import java.io.File;

public class RenameTo {
	public static void rename(String path) {
		File nowPath = new File(path);
		 if (!nowPath.exists()) {
		 System.out.println("输入的路径文件未被建立");
		 System.exit(0);
		 }

		File[] fileArr = nowPath.listFiles();
		for (File f : fileArr) {
			if (f.toString().endsWith("mp3")) {
				String[] splitArr = f.toString().split("\\\\");
				String newPath = "";
				for (int i = 0; i < splitArr.length - 1; i++) {
					newPath += (splitArr[i] + "\\\\");
				}
				
				String[] splitArrInner = splitArr[splitArr.length - 1].split("\\.");
				if(splitArrInner.length == 3){
					newPath += (splitArrInner[0]+" - "+splitArrInner[1]+"."+splitArrInner[2]);
				}
				
				File newFile = new File(newPath);
				f.renameTo(newFile);
			}
		}
	}
}
