package MethodOverloadingAndRiding;

public class Simple 
{
	public static void Calculation(int a,int b)
	{
		System.out.println("Addition is::"+(a+b));
	}

	public static void Calculation(Double a,int b)
	{
		System.out.println("Multiplication is ::"+(a*b));

	}
	public static void main(String[] args) {
		
		Simple.Calculation(10, 20);
		Simple.Calculation(10.0, 20);

	}

}
