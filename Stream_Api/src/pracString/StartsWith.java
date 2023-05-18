package pracString;

public class StartsWith 
{
	

	public static void main(String[] args) 
	{
		String s1="Sachin";
		char ch1 ='S';
		char ch2 ='a';
		StartsWith(s1,ch1,ch2);
		

	}

	private static void StartsWith(String s1, char ch1, char ch2) {
		boolean startsWith=false;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(0)==ch1 && s1.charAt(1)==ch2)
			{
				System.out.println("true");
				break;
			}
			else
			{
				System.out.println("false");
				break;
			}
		}
		
		
		
	}

}
