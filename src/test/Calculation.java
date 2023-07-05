package test;

public class Calculation {
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		int value=cal.add();
		cal.sub();
		double value2=Calculation.mul(40,20);
		System.out.println( "Addition result=" +value);
		System.out.println( "Multiplication result=" +value2);
		
		
	}
	//non-parametized method
	int add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		return res;
				
	}
	
	//non-method
     void sub()
     {
    	 int a=10;
    	 int b=20;
    	 int res =a-b;
    	 System.out.println("Subtraction result =" +res);
    	
    	 
     }

         //parametrized static method
      static double mul(double a,double b) {
    	  
    	  double res=a*b;
    	  return res;
    	  
      }
}
      
	
	
	
	



