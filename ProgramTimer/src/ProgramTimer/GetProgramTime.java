package ProgramTimer;

/*
 * 这是一个测试程序时长的抽象类
 */
public abstract class GetProgramTime {
	public long getProgramTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}
	public abstract void code();
}

