package p2023_07_13;

public class Oper01 {
	public static void main(String[] args) {
		// 산술 연산자 : +, -, *, /, %
		// int 데이터 간 산술연산 결과 : int
		int a = 10, b = 3, c;
		c= a + b;
		System.out.println("a + b = " + c);
		System.out.println("a + b = " + (a + b));	// 13
		System.out.println("a - b = " + (a - b));	// 7
		System.out.println("a * b = " + (a * b));	// 30
		System.out.println("a / b = " + (a / b));	// 3(몫)
		System.out.println("a % b = " + (a % b));	// 1(나머지)
	}
}
