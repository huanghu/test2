package gc;

/**
 * -Xms20M -Xmx20M -Xmn10M -verbose:gc -XX:+PrintGCDetails -XX:UseSerialGC
 * @author huanghu
 *
 */
public class GCSimple {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		while(true){
			byte[] b = new byte[10 * 15 * 1024];
			
		}
	}
}
