package garbageCollector;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Finalize method called");
		Example1 one=new Example1();
		Example1 two=new Example1();
		one=null;
		two=null;
		System.gc();
		
		
	}

}
