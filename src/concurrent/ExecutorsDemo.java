package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
	public static void main(String[] args){
		ExecutorService service =  Executors.newFixedThreadPool(3);
		for (int i = 0 ; i < 4 ;i ++) {
			int  j = i;
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(10000);
						System.out.println("test" + j);
					} catch (Exception e) {
					}

				}
			});
		}

	}
}
