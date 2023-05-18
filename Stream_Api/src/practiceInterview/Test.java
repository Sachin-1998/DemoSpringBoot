package practiceInterview;

public class Test {

	{
		System.out.println("In Main Method");
		m1();

	}

	private static void m1() 
	{
		System.out.println("In m1 method");
		m2();
		
	}

	private static void m2() 
	{
		System.out.println("In m2 method");
		m1();
	}	
	public static void main(String[] args) {
	
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
