package pracString;

public class PrintDubCharInString {

	public static void main(String[] args) {
		
		String s2="abcdeab";
		//String s2=s1.toLowerCase();
		printDublicate(s2);

	}

	private static void printDublicate(String s2) {
		String s3=" ";
		int cnt=0;
		for (int i = 0; i < s2.length(); i++) 
		{
			
			for (int j = i+1; j < s2.length(); j++) 
			{
				if(s2.charAt(i)==s2.charAt(j))
				{
					cnt++;
					s3=s3+s2.charAt(i);
				}
				
			}
			
		}
		System.out.println(cnt);
		System.out.println(s3);
		
	}

}
