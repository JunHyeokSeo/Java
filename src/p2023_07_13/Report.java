package p2023_07_13;

import java.util.Scanner;

public class Report {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, min, max;
		System.out.println("3개의 정수를 입력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		min = (num1 < num2) ? num1 : num2;
		min = (min < num3) ? min : num3;
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
