package test;

public class ReverseNumberAssignment {
	public static void main(String[] arg)
	
	{
		int a=346,rem,rev=0;
		
         while (a!=0)
         {
        	 rem=a%10;
        	 rev=rev*10+rem;
        	 a=a/10;
         }
          System.out.print(rev);
	}

}
