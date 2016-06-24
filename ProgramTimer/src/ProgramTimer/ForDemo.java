package ProgramTimer;

/*
 * 更换code下程序即可测试各种程序运行时长
 * 
 */
public class ForDemo extends GetProgramTime {
	@Override
	public void code() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}
