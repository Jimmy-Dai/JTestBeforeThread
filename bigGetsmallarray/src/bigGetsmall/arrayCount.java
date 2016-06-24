package bigGetsmall;

public class arrayCount {
	public static void main(String[] args) {
		String longArray = "uozyojavaivh//javawljk\\ehbkjfg.java.,hjsab;lkfjp||java092`78&&yhufg!javawh84o7,687tvzh^java*&gkjwahejgfpi20i89";
		String smallArray = "java";

		int count = searchArray.findcount(longArray, smallArray);
		System.out.println("小数组出现了" + count + "次");
	}
}

class searchArray {
	public static int findcount(String longArr, String smallArr) {
		int count = 0;
		while ((longArr.indexOf(smallArr)) != -1) {
			longArr = longArr.substring(longArr.indexOf(smallArr) + smallArr.length());
			count++;
		}
		return count;
	}

}
