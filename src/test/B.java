package test;

public class B {
	

public static void main(String[]  args){

		 K k1 = new K();

		    
		   int value=k1.add(k1.add(10,20),k1.add(30,40));
		    System.out.println(value);
		    

		  }

		}
class K{

	  public int add(int i , int j){
         
	    return i+j;

	  }

	

}


