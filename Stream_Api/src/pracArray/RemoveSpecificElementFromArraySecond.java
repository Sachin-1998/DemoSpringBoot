package pracArray;

public class RemoveSpecificElementFromArraySecond {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 7, 8, 9, 4 };
		int element = 4;
		removeElement(a, element);

	}

	private static void removeElement(int[] a, int element) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == element)

				continue;
			System.out.print(a[i] + " ");

		}

	}

}
