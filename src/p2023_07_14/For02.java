package p2023_07_14;

public class For02 {
	public static void main(String[] args) {
		//1~10까지 합을 구하는 프로그램을 작성하세요
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("1 ~ %-2d = %-2d\n", i, sum);
		}
		
//		System.out.println(i); // 오류발생 (i변수가 지역변수)
		System.out.println("sum = " + sum);
	}
}
