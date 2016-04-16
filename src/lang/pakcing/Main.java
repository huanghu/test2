package lang.pakcing;

/**
 * 拆箱，装箱
 * @author huanghu
 *
 */
public class Main {
	public static void main(String[] args){
		Integer a = 321;
		Integer b = 321;
		Integer c = new Integer(3);
		Integer d = new Integer(3);
		System.out.println("result " + (c.equals(d)));
	}
}
