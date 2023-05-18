package pracString;

public class toUpperCase {

	public static void main(String[] args) {
		
		String s1="Great Software lab";
		changeToUpperCase(s1);

	}

	private static void changeToUpperCase(String s1) {
		
		String s2=" ";
		for (int i = 0; i < s1.length(); i++) {
			
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char) (ch-32);
				s2=s2+ch;
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println("after conversion::"+s2);
	}

}
