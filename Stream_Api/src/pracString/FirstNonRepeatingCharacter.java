package pracString;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {

		String str = "Akashay Kumar";
		String s = str.toLowerCase();
		String s2 = " ";

		for (int i = 0; i < s.length(); i++) 
		{
			int count = 0;
			for (int j = i + 1; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					break;

				}
			}
			if (count == 0) 
			{
				s2 = s2 + s.charAt(i);
				break;
			}
			

		}
		System.out.println(s2 + " ");
	}

}
