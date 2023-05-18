package pracString;

public class RemoveSpecificChar {

	public static void main(String[] args) {
		String s = "sachiyn";
		char ch = 'y';
		removeSpecChar(s, ch);
	}

	private static void removeSpecChar(String s, char ch) {

		String s1 = " ";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ch) {
				s1 = s1 + s.charAt(i);
			}

		}
		System.out.println(s1);

	}

}
