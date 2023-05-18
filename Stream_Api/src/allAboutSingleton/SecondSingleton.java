package allAboutSingleton;

public class SecondSingleton {

	public static void main(String[] args) {
		Test t=Test.getTest();
		System.out.println(t.hashCode());
		Test t1=Test.getTest();
		System.out.println(t1.hashCode());
	}

}

class Test {

	private static Test test = null;
	private Test(){
		
	}
	public static Test getTest()
	{
		if(test==null)
		{
			test=new Test();
		}
		return test;
	}
}
