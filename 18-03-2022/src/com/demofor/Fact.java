package com.demofor;

public class Fact {
	static void number()
	{
		int f=0, s=0;
		for(int i=1; i<=3;i++)
		{
			f=1;
		
			for(int j=1; j<=i; j++)
			{
				f=f*j;
			}
			s=s+f;
		
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
         Fact.number();
	}

}
