package javaLogicalCodes;

import java.util.Scanner;

public class PrimeNumbers 
{
	
	public static void main(String[] args)
	{
		System.out.println("enter the num to check it is prime or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number==0 || number==1)
		{
			System.out.println("Not");
		}
		else
		{
			for(int i=2;i<=100;i++)
			{
				if(number%i!=0)
				{
					System.out.println("prime number");
					break;
				}
				else
				{
					System.out.println("given num is not prime num");
					break;
				}
			}
		}
		
	}

}
