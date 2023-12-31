package p2023_07_14;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		//3
//		if(조건식1)
//		    조건식1이 참인경우 실행될 문장;
//		else if(조건식2)
//		    조건식2가 참인경우 실행될 문장;
//		else
//			위의 조건식을 만족하지 않을때 실행될 문장;
		
		// 키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램
		// 90점 이상 - A 학점
		// 80점 이상 - B 학점
		// 70점 이상 - C 학점
		// 60점 이상 - D 학점
		// 60점 미만 - F 학점
		System.out.println("0~100점 사이의 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();	// s = 95
		
		// if else if 문은 여러개의 조건식을 모두 만족하더라도,
		// 가장 먼저 만족하는 조건절 아래의 문장만 실행 
		if (s >= 90) {
			System.out.println("A학점");
		}
		else if (s >= 80) {
			System.out.println("B학점");
		}
		else if (s >= 70) {
			System.out.println("C학점");
		}
		else if (s >= 60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		sc.close();
	}
}
