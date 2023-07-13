package p2023_07_13;

public class Oper04 {
	public static void main(String[] args) {
		// 비교 연산자(관계 연산자) : >, >=, <, <=, ==, !=
		// 기본자료형은 비교 연산자를 통해 값 비교 가능
		// 참조형은 주소를 가리키기 때문에, 비교 연산자를 통해 값 비교 불가능
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		
		// 비교 연산자로 주소값을 비교
		if(str1 == str2)
			System.out.println("같은 주소");	//같은 주소
		else
			System.out.println("다른 주소");
		if(str1 == str3)
			System.out.println("같은 주소");
		else
			System.out.println("다른 주소");	//다른 주소
		
		// 값을 비교
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1.equals(str3));	//true
	}
}
