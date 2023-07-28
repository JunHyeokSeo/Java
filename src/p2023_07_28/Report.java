package p2023_07_28;

import java.util.*;

public class Report {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0) System.out.println("윤년");
		else if (year % 100 == 0 && year % 400 == 0) System.out.println("윤년");
		else System.out.println("평년");
	}
}
