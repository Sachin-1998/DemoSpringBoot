package pracArray;

public class CheckEqualityOfArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,6};
		int [] b= {1,2,3,4,7};
		
		checkEquality(a,b);

	}

	private static void checkEquality(int[] a, int[] b) {
		
		if(a.length!=b.length)
		{
			System.out.println("Not Equal by length");
		}
		else
		{
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]!=b[i])
					count++;
			}
			if(count==0)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same");
			}
		}
		
	}

}
