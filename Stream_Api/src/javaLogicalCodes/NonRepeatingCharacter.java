package javaLogicalCodes;

public class NonRepeatingCharacter
{
	public static void main(String[] args) {
		
		String s = "Akashay Kumar";
		String str=s.toLowerCase();
		char nonRepeatingChar = ' ';
		{

			for (int i = 0; i < str.length(); i++) 
			{
				boolean isRepeating = false;
				for (int j = 0; j < str.length(); j++) 
				{
					if (i != j && str.charAt(i) == str.charAt(j)) {
						isRepeating = true;
						break;
					}
				}
				if (!isRepeating) {
					nonRepeatingChar = str.charAt(i);
					break;
				}
			}

			System.out.println("Non-repeating character is: " + nonRepeatingChar);
		}

	}
}
