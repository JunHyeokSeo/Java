package p2023_07_14;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		//키보드로 입력한 구구단 1개단을 while문으로 출력
		System.out.println("원하는 단을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt(), i = 0;
		while (i++ < 9) System.out.println(dan + "*" + i + "=" + dan * i);
		sc.close();
	}
}
