package test;

	public class VisibiltyExample {
		public static void main(String[] args) {
	        // Accessing the static methods within the same class
	        VisibiltyExample.privateMethod();
	        VisibiltyExample.defaultMethod();
	        VisibiltyExample.protectedMethod();
	        VisibiltyExample.publicMethod();
		}
	        private static void privateMethod() {
	            System.out.println("This is a private static method.");
	        }
		
	   static void defaultMethod() {

    	 System.out.println("This is default static  method");
     }
     
      protected static void protectedMethod()
      {
    	  System.out.println("This is protected static method");
      }
     public static void publicMethod()

     {
    	 System.out.println("This is public static method");
     }
     
     
}
	
      

