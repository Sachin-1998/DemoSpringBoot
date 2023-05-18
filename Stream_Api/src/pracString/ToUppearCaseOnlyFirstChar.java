package pracString;

public class ToUppearCaseOnlyFirstChar {

	public static void main(String[] args) {

		String s1 = "great lab";
		uppearCaseOnlyFirstCharacter(s1);

	}

	private static void uppearCaseOnlyFirstCharacter(String s1) {
		
		String s2=" ";
		
		char ch1='g';
		char ch2='l';
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			
			if(ch>='a' && ch<='z' && ch==ch1 || ch==ch2)
			{
				ch=(char)(ch-32);
			    s2=s2+ch;
		    }
			else
			{
				s2=s2+ch;
			}
			
		}
		System.out.println(s2);
		
	}

}
