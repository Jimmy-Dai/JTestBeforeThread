package year;

import java.util.Calendar;
import java.util.Scanner;

public class getYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�������:");
		int year=sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2,1);
		c.add(Calendar.DATE, -1);
		
		if(c.get(Calendar.DATE)==29){
			System.out.print(year+"����������,");
		}else{
			System.out.print(year+"���겻������,");
		}
		
		System.out.println("2�·���("+c.get(Calendar.DATE)+")�죬");
	}

}
