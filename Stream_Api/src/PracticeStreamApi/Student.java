package PracticeStreamApi;

public class Student 
{
	private int id;
	private String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Student(Student s)
	{
		id=s.id;
		name=s.name;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student(11,"Ram");
		Student copyConst=new Student(s1);
		System.out.println("id "+s1.getId()+" "+"name "+s1.getName());
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("copyConstId "+copyConst.getId()+" "+"copyConstName "+copyConst.getName());
	}

}
