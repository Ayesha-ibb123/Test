package test;

public class SumOfDigitsAssignment {
	public static void main(String [] arg)
	
	{
		int a=234;
		int rem=0;
		int sum=0;
		
        while(a> 0)
        {
        	rem=a%10;
        	sum=sum+rem;
        	a=a/10;
   }
        System.out.print(sum);
				
				
	
	}
}
