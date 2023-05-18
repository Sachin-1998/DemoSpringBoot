package allAboutSingleton;

public class FirstSingleton {

	public static void main(String[] args) {
		
		myClass m=myClass.getMyClassObj();
		System.out.println(m.hashCode());

	}

}
class myClass{
	
	private static myClass m=new myClass();
	private myClass()
	{
		
	}
	public static myClass getMyClassObj()
	{
		return m;
	}
	
}
