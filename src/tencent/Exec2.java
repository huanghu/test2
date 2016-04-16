package tencent;

/**
 * 两个数组 [1,3,5,7,9],[2,4,6,8,10],排序
 * @author huanghu
 *
 */
public class Exec2 {
	public static void main(String[] args){
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8,10};
		int[] d = new int[a.length + b.length];
		
		int leftPos  = 0;
		int leftEnd = a.length - 1;
		int rightPos = 0;
		int rightEnd = b.length - 1;
		int dPos = leftPos;
		
		while (leftPos <= leftEnd && rightPos <= rightEnd) {
		if (a[leftPos] <= b[rightPos]) {
			d[dPos++] = a[leftPos ++];
		}else {
			d[dPos++] = b[rightPos ++];
		}
	}
	
	while (leftPos <= leftEnd) {
		d[dPos ++] = a[leftPos ++];
	}
	
	while (rightPos <= rightEnd) {
		d[dPos ++] = b[rightPos++];
	}
		
		for (int i = 0; i < d.length; i++) {
			System.err.println(d[i]);
		}
	}
}
