package pracString;

public class addSpecChar {

	public static void main(String[] args) {
		
		String s="aaabbb";
		char ch='a';
		char ch2='d';
		set(s,ch,ch2);

	}

	private static void set(String s, char ch, char ch2) {
		
		String s2=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				s2=s2+ch2;
			else
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

	
}
