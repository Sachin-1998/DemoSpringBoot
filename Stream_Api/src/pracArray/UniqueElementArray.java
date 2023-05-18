package pracArray;

public class UniqueElementArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,1};
		UniqueArray(a);

	}

	private static void UniqueArray(int[] a) {
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
		}
		System.out.println("dub count::"+cnt);
		int [] b=new int[a.length-cnt];
		int bindex=0;
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count==0)
			{
				b[bindex++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Unique Pairs");
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				System.out.println(b[i]+" "+b[j]);
				//break;
			}
		}
		
	}

}
