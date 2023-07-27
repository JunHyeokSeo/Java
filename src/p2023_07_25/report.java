package p2023_07_25;

import java.util.Scanner;

public class report {
	static boolean validation(String str){
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int total = 0, check = str.charAt(12) - '0';

		for (int i = 0; i < arr.length; i++)
			total += Integer.parseInt(str.substring(i, i + 1)) * arr[i];
		total %= 11;
		total = 11 - total;
		if (total > 9) total %= 10;
		return total == check;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			String id = sc.nextLine();
			String front = id.substring(0, id.indexOf("-"));
			String back = id.substring(id.indexOf("-") + 1);

			if (front.length() != 6 || back.length() != 7) {
				System.out.println("주민번호의 자릿수가 13자리가 아닙니다.");
				return;
			}
			if (!validation(front + back)) {
				System.out.println("유효하지 않은 주민번호입니다.");
				return;
			}
			System.out.println("유효한 주민번호입니다.");
		}
		catch (Exception e){
			System.out.println("잘못된 값을 입력하여 오류가 발생했습니다.");
		}
		sc.close();
	}
}
