package p2023_07_18;

import java.util.Scanner;

public class Report01 {
	public static void main(String[] args) {
		//변수 선언 및 초기화
		int[] arr = new int[5];
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);

		//정수 입력
		System.out.println("5개의 정수를 입력하세요");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		//max, min 초기값 설정
		max = arr[0];
		min = arr[0];

		//최대 최소 탐색
		for (int i : arr){
			if (i > max) max = i;
			if (i < min) min = i;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
