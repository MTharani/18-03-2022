package com.demofor;

public class PrintPrimeNumber 
{
	static void numberPrint()
	{
		int c=0;
		for(int i=1;i<=5;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c=c+1;
				}
				
			}
		
		if(c==2)
		{
			System.out.println(i+" ");
		}
		}

	}

	public static void main(String[] args)
	{
		PrintPrimeNumber.numberPrint();

	}

}
