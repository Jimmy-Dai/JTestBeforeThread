package year;

import java.util.Calendar;
import java.util.Scanner;

public class getYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("输入年份:");
		int year=sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2,1);
		c.add(Calendar.DATE, -1);
		
		if(c.get(Calendar.DATE)==29){
			System.out.print(year+"这年是闰年,");
		}else{
			System.out.print(year+"这年不是闰年,");
		}
		
		System.out.println("2月份有("+c.get(Calendar.DATE)+")天，");
	}

}
