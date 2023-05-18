package pracArray;

public class RemoveSpecificEleFromArray {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 8, 3, 5, 6 };
		int num = 3;
		removeElement(a, num);

	}

	private static void removeElement(int[] a, int num) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				count++;

			}

		}
		int[] b = new int[a.length - count];
		int bindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=num)
			{
				b[bindex++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
