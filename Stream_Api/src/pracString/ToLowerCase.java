package pracString;

public class ToLowerCase {

	public static void main(String[] args) {
		String str = "HELloooWORLD";
		String s2=" ";
		StringBuilder lowercase = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z')
			{
				c = (char) (c + 32);
				s2=s2+c;
			}
			else
			{
				//c = (char) (c + 32);
				s2=s2+c;
			}
			

			lowercase.append(c);
		}
		System.out.println(lowercase.toString());
		System.out.println(s2);

		

		
	}

	

}
