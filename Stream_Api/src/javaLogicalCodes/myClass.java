package javaLogicalCodes;

public class myClass 
{
	public static void main(String[] args) {
		
		String s1="Salman Khan";
		String s2=s1.toLowerCase();
		char s3=' ';
		
		for(int i=0;i<s2.length();i++)
		{
			int count=0;
			
			for(int j=i+1;j<s2.length();j++)
			{
				if(i!=j && s2.charAt(i)==s2.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				s3=s2.charAt(i);
				break;
			}
			
		}
		System.out.println("The first non repeating char is: "+s3);
		
		
		
		
	}

}
