package pracString;

public class printOriginalCharInString {

	public static void main(String[] args) {
		
		String s1="abcdebc";
		printOriginalChar(s1);
	}

	private static void printOriginalChar(String s1) 
	{
		String  s2=" ";
		
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		
		
	}

}
