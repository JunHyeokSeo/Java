package p2023_07_13;

import java.util.Scanner;

public class Oper07 {
	public static void main(String[] args) {
		//논리 연산자 : ||, &&, !
		// 5과목의 점수를 키보드로 입력 받았을 때, 점수를 기준으로 합/불 판별
		// 과목당 과락은 40점, 평균 60점 이상 받아야 합격
		int n1, n2, n3, n4, n5, total;
		double avg;
		System.out.println("5과목의 점수를 입력 하세요");		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		total = n1 + n2 + n3 + n4 + n5;	// 총점
		
		//1. int형과 int형을 산술연산을 수행하면 결과는 int형이 된다
		//2. int형과 double형을 산술연산을 수행하면 큰 자료형인 double형으로 처리된다.
		avg = total / 5.0;				// 평균
		System.out.println("avg : " + avg);
		
		if (n1 >= 40 && n2 >= 40 && n3 >= 40 &&
				n4 >= 40 && n5 >= 40 && avg >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
