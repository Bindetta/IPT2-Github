public class Calculator{
	public static void main(String[]args){
		int a = 12;
		int b = 4;
	System.out.println("Addition " + add(a,b));
	System.out.println("Subtraction " + sub(a,b));
	System.out.println("Multiplication " + multi(a,b));
	System.out.println("Division " + div(a,b));
	System.out.println("Modulus " + mod(a,b));
	}
	public static int add(int a, int b){
		return a + b;
	}
	public static int sub(int a, int b){
		return a - b;
	}
	public static int multi(int a, int b){
		return a * b;
	}
	public static int div(int a, int b){
		return a / b;
	}
	public static int mod(int a, int b){
		return a % b;
	}
}
