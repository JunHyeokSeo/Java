package p2023_07_13;

public class Oper11 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		//후행연산
		System.out.println("a = " + a++);	// a=10
		System.out.println("a = " + a);		// a=11

		//선행연산
		System.out.println("b = " + ++b);	// b=11
		System.out.println("a = " + b);		// b=11
	}
}
