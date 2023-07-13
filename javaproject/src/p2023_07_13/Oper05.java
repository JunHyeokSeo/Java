package p2023_07_13;

import java.util.Scanner;

public class Oper05 {
	public static void main(String[] args) {
		System.out.println("정수 2개를 입력하세요?");

		// 표준입력 장치인 키보드로 입력을 받기 위해서 Scanner 객체를 생성한다.
		// 대부분의 클래스들은 new 연산자를 사용하여 객체를 생성
		// 유일하게 String 클래스만이 new 없이 객체를 생성할 수 있다.
		// 매개변수로 표준 입력 스트림을 받음
		// 입력 스트림을 사용하기 위해 System 클래스의 정적 필드 in을 사용
		// System은 정적 클래스이기 때문에 객체 생성 없이 메소드 사용 가능
		Scanner sc = new Scanner(System.in);
		
		// 정수형태로 입력을 받기 위해서 nextInt() 메소드로 입력을 받는다.
		int n1 = sc.nextInt();	// 공백(공백 + 개행)으로 문자열 구분
		int n2 = sc.nextInt();
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		if (n1 > n2)
			System.out.println(n1 + "이 " + n2 + "보다 크다");
		else
			System.out.println(n2 + "이 " + n1 + "보다 크다");
		sc.close();
	}
}
