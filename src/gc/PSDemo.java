package gc;

/**
 * -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -verbose:gc -XX:+PrintGCDetails -XX:+UseParallelGC
 * @author huanghu
 *
 */
public class PSDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception{
		byte[] bytes = new byte[1024 * 1024 * 2];
		byte[] byte2 = new byte[1024 * 1024 * 2];
		byte[] byte3 = new byte[1024 * 1024 *2];
		
		System.out.println("ready to direct allocate to old");
		Thread.sleep(3000);
		
		byte[] byte4 = new byte[1024 * 1024 * 4];
		
		Thread.sleep(3000);
	}
}
