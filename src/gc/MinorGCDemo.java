package gc;

/**
 * -Xms40M -Xmx40M -Xmn16M -verbose:gc -XX:+PrintGCDetails -XX:+UseParallelGC
 * @author huanghu
 *
 */
public class MinorGCDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception{
		MemoryObject object = new MemoryObject(1024 * 1024);
		for (int i = 0; i < 2; i++) {
			happenMinorGC(11);
			Thread.sleep(2000);
		}
	}
	
	private static void happenMinorGC(int happenMinorGCIndex) throws Exception{
		for (int i = 0; i < happenMinorGCIndex; i++) {
			if (i == happenMinorGCIndex - 1) {
				Thread.sleep(2000);
				System.out.println("minor gc should happen");
			}
			new MemoryObject(1024 * 1024);
		}
	}
	
	static class MemoryObject{
		@SuppressWarnings("unused")
		private byte[] bytes;
		public MemoryObject(int objectSize){
			this.bytes = new byte[objectSize];
		}
	}
}
