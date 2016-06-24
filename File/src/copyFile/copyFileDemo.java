package copyFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFileDemo {
	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();
		// method1("src.flv", "d:\\copy.flv"); //������
		// method2("src.flv", "d:\\copy.flv");//573����
		// method3("src.flv", "d:\\copy.flv");//982����
		method4("src.flv", "d:\\copy.flv");// 96����
		// method4("d:\\java\\test\\", "d:\\");//ǰ�󲻵�
		long end = System.currentTimeMillis();
		System.out.println("������" + (end - start) + "����");
	}

	// 1 ��������
	private static void method1(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

	// 2 1024��  �ֽ�������
	private static void method2(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		fis.close();
		fos.close();
	}

	// 3 buffered��������
	private static void method3(String src, String dest) throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(dest));
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

	// 4 buffered1024��   ����������
	private static void method4(String src, String dest) throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(dest));
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		fis.close();
		fos.close();
	}
}
