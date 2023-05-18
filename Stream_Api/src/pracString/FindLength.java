package pracString;

public class FindLength
{
	public static void main(String[] args) 
	{
		String s="abcde";
		findLength(s);
		
	}

	private static void findLength(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println(count);
		
	}

}
