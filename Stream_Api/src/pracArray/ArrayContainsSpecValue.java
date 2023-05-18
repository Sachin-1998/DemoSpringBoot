package pracArray;

public class ArrayContainsSpecValue {

	public static void main(String[] args) {
		
		int [] a= {2,4,5,6,7,8};
		int element=5;
		containsSpecificNum(a,element);

	}

	private static void containsSpecificNum(int[] a, int element) {
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}
		
	}

}
