package pracString;

public class StringBufferAllMethods {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb);
		sb.insert(0, "great ");
		System.out.println(sb);
		StringBuffer s=new StringBuffer("Hello ");
		s.replace(1, 5, "igh");
		System.out.println(s);
		StringBuffer s1=new StringBuffer("ggslab ");
		s1.deleteCharAt(0);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.capacity());

		
		

	}

}
