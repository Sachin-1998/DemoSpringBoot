package pracString;

public class ReverseEveryCharInString {

	public static void main(String[] args) {
		String s="Hello my name is sachin";
		ReverseString(s);

	}

	private static void ReverseString(String s) {
		
		//split the string on space basis
		String sa[]=s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			//convert to char array
			char ca[] =sa[i].toCharArray();
			int start=0;
			int end=ca.length-1;
			while(start<end)
			{
				char temp=ca[start];
				ca[start]=ca[end];
				ca[end]=temp;
				start++;
				end--;
			}
			String s2=new String(ca);
			sa[i]=s2;
			
		}
		for (int j = 0; j < sa.length; j++) {
			System.out.print(sa[j]+" ");
		}

		
		
	}

}
