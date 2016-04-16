package gc;

import java.util.HashMap;

/**
 * 测试各种gc参数
 * 
 * @author huanghu
 * SerialGC:-Xmx100m -Xms100m -Xmn20m -XX:+UseSerialGC -XX:+PrintGCDetails -Xloggc:gc.serial.log
 * ParNewGC:-Xmx100m -Xms100m -Xmn20m -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -Xloggc:gc.parnew.cms.log
 * ParallerGC:-Xmx500m -Xms500m -Xmn20m -XX:+UseParallelGC -XX:+UseParallelOldGC -XX:+PrintGCDetails -Xloggc:gc.parallel.log -XX:MaxGCPauseMillis=5
 */
public class StopTheWorld {
	public static class MyThread extends Thread {
		HashMap map = new HashMap<>();

		@Override
		public void run() {
			try {
				while (true) {
					if (map.size() * 512 / 1024 / 1024 >= 90) {
						map.clear();
						System.out.println("clean map");
					}
					byte[] b1;
					for (int i = 0; i < 100; i++) {
						b1 = new byte[512];
						map.put(System.nanoTime(), b1);
					}
					Thread.sleep(1);
				}
			} catch (Exception e) {
				System.out.println("map size " + map.size());
				e.printStackTrace();
			}
		}
	}
	
	public static class PrintThread extends Thread{
		public static final long starttime = System.currentTimeMillis();
		@Override
		public void run(){
			try {
				while (true) {
					long t = System.currentTimeMillis() - starttime;
					System.out.println(t / 1000 + "." + t % 1000);
					Thread.sleep(100);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]){
		try {
			MyThread thread = new MyThread();
			PrintThread p = new PrintThread();
			thread.start();
			p.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
