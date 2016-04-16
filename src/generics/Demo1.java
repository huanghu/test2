package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单泛型
 * 
 * @author huanghu
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		List<? extends A> a = new ArrayList<>();
	}
	
	public static void addB(){
		List<? super A> as = new ArrayList<>();
		B b1 = new B();
		as.add(b1);  //下边界? extends A 就可以添加
	}

	public static class A {
		private int a;
		private int b;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

	}
	
	public static class B extends A{
		
	}
}
