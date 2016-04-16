package demo;

public class HelloWorld {
	public static void main(String[] args){
		try {
			System.out.println("Hello World");
			System.exit(0);
		} finally{
			System.out.println("return");
		}

	}
}
