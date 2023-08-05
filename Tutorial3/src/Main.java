
public class Main {
	public static void main(String[] args) {
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		int d = 200;
		String name = "John Mayer";

		System.out.println((a + b + c) / 3);
		System.out.println("10진수 : " + d);
		System.out.format("8진수 : %o\n" , d);
		System.out.format("16진수 : %x\n", d) ;
		System.out.println(name);
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(3,6));
		System.out.println(name.substring(5,6));
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + (" "));
		}
	}
}
