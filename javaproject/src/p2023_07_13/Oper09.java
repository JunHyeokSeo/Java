package p2023_07_13;

public class Oper09 {
	public static void main(String[] args) {
		// 확장 대입 연산자 : +=, -=, *=, /=, %=
		int a = 10, b = 3;
		System.out.println(a += b);	// 13
		System.out.println(a -= b);	// 10
		System.out.println(a *= b);	// 30
		System.out.println(a /= b);	// 10
		System.out.println(a %= b);	// 1
	}
}
