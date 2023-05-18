package pracArray;

public class UniquePairEqualsSum {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 6;
		sumOfUniquePair(a, sum);

	}

	private static void sumOfUniquePair(int[] a, int sum) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println(a[i] + " " + a[j]);

				}

			}

		}

	}

}
