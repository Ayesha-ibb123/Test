package test;

public class SumOfDigits {
	public static void main(String [] arg)
	{
		int n=9876;
		int rem=0;
		int sum=0;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.print(sum);
	}

}
