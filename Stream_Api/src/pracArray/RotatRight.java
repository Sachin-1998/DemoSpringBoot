package pracArray;

public class RotatRight {

	public static void main(String[] args) {
		
		int [] a= {23,56,32,59};
		RotateRight(a);

	}

	private static void RotateRight(int[] a) {
		
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
