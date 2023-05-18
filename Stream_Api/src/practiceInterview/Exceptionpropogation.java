package practiceInterview;

public class Exceptionpropogation 
{
	void m1()
	{
		int num=10/0;
		
	}
    void m2()
    {
    	m1();
    }
    void m3()
    {
    	try {
			m2();
		} catch (Exception e) {
			System.out.println("exception propgation handled");
		}
    }
	public static void main(String[] args) {
		
		Exceptionpropogation e=new Exceptionpropogation();
		e.m3();
	}

}
