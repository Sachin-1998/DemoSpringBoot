package pracString;

public class twoWaysToCreateString {

	public static void main(String[] args) {
		
		String s="Sachin";
		System.out.println(s.length());
		String s1=new String("Shinde");
		System.out.println(s1.length());
		String s3=s.concat(s1);
		System.out.println(s3+" ");

	}

}
