package ProgramTimer;

/*
 * ����һ�����Գ���ʱ���ĳ�����
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

