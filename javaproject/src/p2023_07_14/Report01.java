package p2023_07_14;

import java.util.Scanner;

public class Report01 {
	public static void main(String[] args) {
		int n1, n2, n3, min, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		}
		else {
			max = n2;
			min = n1;
		}
		if (max < n3) max = n3;
		if (min > n3) min = n3;
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		sc.close();
	}
}
