package pracArray;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		int num=600;
		int start=0;
		int end=a.length-1;
		BinarySearch(a,num,start,end);

	}

	private static void BinarySearch(int[] a, int num, int start, int end) {
		
		int mid=(start+end)/2;
		while(start<=end)
		{
			if(num==a[mid])
			{
				System.out.println(" found");
				break;
			}
		    if(num>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
				
			}
		    mid=(start+end)/2;
			if(start>end)
			{
				System.out.println("not found");
			}
			
		}
		
		
	}

}
