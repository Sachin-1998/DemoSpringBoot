package pracString;

public class EndsWith {

	public static void main(String[] args) {
		
		//ends with,starts with
		String s1="sachin";
		String s2="in";
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.startsWith(s2));
		System.out.println("++++++++++++++++++++++++");
		//contains
		System.out.println(s1.contains(s2));
		System.out.println("+++++++++++++++++++++++++++++");
		//compareTo,compareTo Ignore
		String s3="SING";
		String s4="ing";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
		System.out.println("++++++++++++++++++++++++++++++++++");
		String a="Sachin";
		String b="Sh";
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf('a'));
		System.out.println(a.lastIndexOf('h'));
		System.out.println(a.lastIndexOf(b));
		System.out.println(a.indexOf(b));
		

	}

}
