package threeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class threeListDemo {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<Student>>> diQu = new HashMap<String, HashMap<String, ArrayList<Student>>>();

		HashMap<String, ArrayList<Student>> bjDiQu = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> class1 = new ArrayList<Student>();
		Student s1 = new Student("������1��", 10);
		Student s2 = new Student("������2��", 11);
		class1.add(s1);
		class1.add(s2);
		ArrayList<Student> class2 = new ArrayList<Student>();
		Student s3 = new Student("������3��", 12);
		Student s4 = new Student("������4��", 13);
		class2.add(s3);
		class2.add(s4);
		bjDiQu.put("������", class1);
		bjDiQu.put("��߰�", class2);
		diQu.put("����", bjDiQu);

		HashMap<String, ArrayList<Student>> shDiQu = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> class3 = new ArrayList<Student>();
		Student s5 = new Student("������5��", 14);
		Student s6 = new Student("������6��", 15);
		class3.add(s5);
		class3.add(s6);
		ArrayList<Student> class4 = new ArrayList<Student>();
		Student s7 = new Student("������7��", 16);
		Student s8 = new Student("������8��", 17);
		class4.add(s7);
		class4.add(s8);
		shDiQu.put("������", class3);
		shDiQu.put("��߰�", class4);
		diQu.put("�Ϻ�", shDiQu);

		HashMap<String, ArrayList<Student>> hkDiQu = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> class5 = new ArrayList<Student>();
		Student s9 = new Student("������9��", 18);
		Student s10 = new Student("������10��", 19);
		class5.add(s9);
		class5.add(s10);
		ArrayList<Student> class6 = new ArrayList<Student>();
		Student s11 = new Student("������11��", 20);
		Student s12 = new Student("������12��", 21);
		class6.add(s11);
		class6.add(s12);
		hkDiQu.put("������", class5);
		hkDiQu.put("��߰�", class6);
		diQu.put("���", hkDiQu);

		Set<String> diQuSet = diQu.keySet();
		for (String diQuKey : diQuSet) {
			System.out.println("-----------------------------------------------------");
			System.out.println(diQuKey);
			HashMap<String, ArrayList<Student>> diQuValue = diQu.get(diQuKey);
			Set<String> diQuValueSet = diQuValue.keySet();
			for (String diQuValueKey : diQuValueSet) {
				System.out.println("\t" + diQuValueKey);
				ArrayList<Student> diQuValueValue = diQuValue.get(diQuValueKey);
				for (Student s : diQuValueValue) {
					System.out.println("\t\t" + s.getName() + "---" + s.getAge());
				}
			}
		}
	}
}
