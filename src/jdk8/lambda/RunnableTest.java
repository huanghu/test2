package jdk8.lambda;

public class RunnableTest {
	public static void main(String[] args){
        Runnable runner = () -> System.out.println("I am lambda runner.");
        runner.run();		
	}
}
