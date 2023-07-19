package test;

public class VariableExample {
	public static void main(String[] args) {
		VariableExample v1=new VariableExample();
		v1.Call();
	}
	
	    // Instance variable
	    int instanceVar = 10;

	    // Static variable
	    static int staticVar = 20;

	    public void Call() {
	        // Local variable
	        int localVar = 30;

	        System.out.println("Instance variable: " + instanceVar);
	        System.out.println("Static variable: " + staticVar);
	        System.out.println("Local variable: " + localVar);
	    }

}