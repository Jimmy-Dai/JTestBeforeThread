package getFile;

import java.io.File;

public class GetFile {
	public static int FoldersNum = 0;
	public static int FilesNum = 0;

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
				FoldersNum++;
			} else {
				FilesNum++;
				System.out.println(sm);
			}
		}
	}

	public static void filesNum() {
		System.out.println("�ļ�����:" + FoldersNum);
		System.out.println("�ļ���:" + FilesNum);
	}
}
