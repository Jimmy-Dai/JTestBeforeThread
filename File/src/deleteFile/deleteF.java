package deleteFile;

import java.io.File;

public class deleteF {
	public static void main(String[] args) {
		File srcFolder = new File("demo");
		
		deleteFolder(srcFolder);
		
	}

	private static void deleteFolder(File srcFolder) {
		/*
		 * �ж��Ƿ����ļ�/�ļ���
		 * �ǣ������ж�
		 * ��ɾ��
		 */
		File[] fileArray = srcFolder.listFiles();
		
		for(File f:fileArray){
			if(f.isDirectory()){
				deleteFolder(f);
			}else{
				System.out.println(f.getName()+"---"+f.delete());
			}
		}
		System.out.println(srcFolder.getName()+"==="+srcFolder.delete());
	}
}
