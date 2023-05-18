package pracArray;

public class ReverseArrayUsingThirdVariable {

	public static void main(String[] args) {
		
		int [] a= {1,2,21,3,4,5,23,6,7,8};
		reverseArray(a);

	}
	public static void reverseArray(int [] a)
	{
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
