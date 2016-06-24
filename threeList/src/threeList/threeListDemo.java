package threeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class threeListDemo {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<Student>>> diQu = new HashMap<String, HashMap<String, ArrayList<Student>>>();

		HashMap<String, ArrayList<Student>> bjDiQu = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> class1 = new ArrayList<Student>();
		Student s1 = new Student("人造人1号", 10);
		Student s2 = new Student("人造人2号", 11);
		class1.add(s1);
		class1.add(s2);
		ArrayList<Student> class2 = new ArrayList<Student>();
		Student s3 = new Student("人造人3号", 12);
		Student s4 = new Student("人造人4号", 13);
		class2.add(s3);
		class2.add(s4);
		bjDiQu.put("基础班", class1);
		bjDiQu.put("提高班", class2);
		diQu.put("北京", bjDiQu);

		HashMap<String, ArrayList<Student>> shDiQu = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> class3 = new ArrayList<Student>();
		Student s5 = new Student("人造人5号", 14);
		Student s6 = new Student("人造人6号", 15);
		class3.add(s5);
		class3.add(s6);
		ArrayList<Student> class4 = new ArrayList<Student>();
		Student s7 = new Student("人造人7号", 16);
		Student s8 = new Student("人造人8号", 17);
		class4.add(s7);
		class4.add(s8);
		shDiQu.put("基础班", class3);
		shDiQu.put("提高班", class4);
		diQu.put("上海", shDiQu);

		HashMap<String, ArrayList<Student>> hkDiQu = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> class5 = new ArrayList<Student>();
		Student s9 = new Student("人造人9号", 18);
		Student s10 = new Student("人造人10号", 19);
		class5.add(s9);
		class5.add(s10);
		ArrayList<Student> class6 = new ArrayList<Student>();
		Student s11 = new Student("人造人11号", 20);
		Student s12 = new Student("人造人12号", 21);
		class6.add(s11);
		class6.add(s12);
		hkDiQu.put("基础班", class5);
		hkDiQu.put("提高班", class6);
		diQu.put("香港", hkDiQu);

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
