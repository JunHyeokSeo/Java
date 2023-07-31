package p2023_07_31;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Report {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("연도 입력");
		int year = sc.nextInt();
		if (gc.isLeapYear(year)) System.out.println("윤년");
		else System.out.println("평년");
	}
}
