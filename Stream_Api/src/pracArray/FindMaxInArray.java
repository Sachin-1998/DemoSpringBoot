package pracArray;

public class FindMaxInArray {

	public static void main(String[] args) {
		
		int [] a= {10,23,76,15,34};
		findMax(a);

	}

	private static void findMax(int[] a) {
		int max=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
				max=a[i];
			
		}	
		System.out.println("max Array element "+max);
	}

}
