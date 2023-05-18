package pracString;

public class sumString {

	public static void main(String[] args) {

		String s = "abcd2g3g4g5k";
		sum(s);

	}

	private static void sum(String s) {

		// ascii value for character '0' to '9' is 48 to 57.
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > '0' && s.charAt(i) < '9')
				sum = sum + (s.charAt(i)-48);

		}
		System.out.println("sum of digit available in string is:"+sum);

	}

}
