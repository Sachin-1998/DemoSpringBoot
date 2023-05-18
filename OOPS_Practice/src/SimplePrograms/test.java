package SimplePrograms;

public class test 
{
	private int rn;
	private String sname;
	private String marks;
	
	public String toString()
	{
		return "roll num::"+rn+" "+"stud name::"+sname+" "+"stud marks::"+marks;
	}

	public static void main(String[] args) {
		test t=new test();
		System.out.println(t);

	}

}
