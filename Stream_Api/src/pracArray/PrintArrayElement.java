package pracArray;

public class PrintArrayElement {

	public static void main(String[] args) {
		
		int [] a={10,55,78,99};
		printArray(a);

	}
	public static void printArray(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
