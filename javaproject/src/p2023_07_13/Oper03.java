package p2023_07_13;

public class Oper03 {
	public static void main(String[] args) {
		// 비교 연산자(관계 연산자) : >, >=, <, <=, ==, !=
		// 비교 연산자의 결과가 참이면 true, 거짓이면 false 값 return
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);				//true
		boolean result2 = (num1 != num2);				//false
		boolean result3 = (num1 <= num2);				//true
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println(num1 < num2);				//false
		
		char c1 = 'A';	//65 (10진수 아스키코드값)
		char c2 = 'B';	//66
		boolean result4 = (c1 < c2);					//ture
		System.out.println("result4 : " + result4);
	}
}
