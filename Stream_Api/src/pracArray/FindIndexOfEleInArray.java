package pracArray;

public class FindIndexOfEleInArray {

	public static void main(String[] args) {
	
		int [] a= {2,3,4,5,7,4};
		int num=400;
		findIndex(a,num);

	}

	private static void findIndex(int[] a, int num) {
	
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("Index Of Element "+i);
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("Not Found");
		}
		
	}

}
