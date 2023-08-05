
public class Main {

	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "À±±â¿µ";
		int r = 30;
		int a = INT_MAX;
		int a1 = 1;
		int b = 2;
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		System.out.println(r * r * PI);
		System.out.println(a + 1);
		
		System.out.println("a + b = " + (a1 + b));
		System.out.println("a - b = " + (a1 - b));
		System.out.println("a * b = " + (a1 * b));
		System.out.println("a / b = " + (a1 / b));
		
	}

}
