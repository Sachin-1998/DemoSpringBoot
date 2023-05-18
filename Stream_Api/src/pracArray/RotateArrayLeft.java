package pracArray;

public class RotateArrayLeft {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		rotateArrayLeft(a);

	}

	private static void rotateArrayLeft(int[] a) {
		
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			a[a.length-1]=temp;
		}
		for (int k = 0; k < a.length; k++) 
		{
			System.out.print(a[k]+" ");
			
		}
		
	}

}
