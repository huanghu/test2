package inherit;

public class Son extends Father{
	@Override
	public void a(){
		System.out.println("son a");
	}
	
	public static void main(String[] args){
		Son s = new Son();
		s.b();
	}
}
