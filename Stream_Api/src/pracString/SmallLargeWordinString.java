package pracString;

public class SmallLargeWordinString {

	public static void main(String[] args) {

		String s = "Hello may i come";
		findSmallAndlarge(s);

	}

	private static void findSmallAndlarge(String s) {

		String sa[] = s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = 0; j < sa.length; j++) {
				if(sa[i].length()<sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println("large: "+sa[sa.length-1]);
		System.out.println("small:"+sa[0]);
	}

}
