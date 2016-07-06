package RenameTo;

import java.io.File;

public class GetFile {
	public static void find(String src) {
		File f = new File(src);
		if (!f.exists()) {
			System.out.println("�����·���ļ�δ������");
			System.exit(0);
		}
		File[] s = f.listFiles();
		for (File sm : s) {
			if (sm.isDirectory()) {
				find(sm.toString());
			} else {
				rename(sm);
//				System.out.println(sm);
			}
		}
	}
	
	private static void rename(File f){
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
