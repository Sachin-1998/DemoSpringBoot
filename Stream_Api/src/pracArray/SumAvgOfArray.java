package pracArray;

public class SumAvgOfArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7,8};
		sumOfArray(a);

	}

	private static void sumOfArray(int[] a) {
		
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a[i];
		}
		System.out.println("Sum Of Array ::"+sum);
		System.out.println("Avg::"+avg);
		
		
	}

}
