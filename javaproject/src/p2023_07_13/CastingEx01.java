package p2023_07_13;

// p78
// 서로 다른 자료형의 변수를 산술연산을 수행하면 큰 자료형으로 자동형변환
public class CastingEx01 {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		
		int i = 100;
		double d = 3.14;
		double result1 = i + d;
		System.out.println(result1);
		
		// 1. 같은 자료형을 산술연산하면 같은 자료형 처리된다.
		// 2. 서로 다른 자료형을 산술연산하면 가장 큰 자료형으로 자동 형변환 된다.
		int total = 93;
		System.out.println(total / 5);		// 18
		System.out.println(total / 5.0);	// 18.6
		
		double result2 = total / 5;			// 18.0
		double result3 = total / 5.0;		// 18.6
		System.out.println(result2);
		System.out.println(result3);
	}
}
