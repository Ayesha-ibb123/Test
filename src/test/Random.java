package test;

public class Random {
	static int  x= 0;// Declare x as a static variable at the class level
	public static void main(String args[]) {
		System.out.println(fun());
		}
		static int fun() {
		
		return ++x;
		}
		}


