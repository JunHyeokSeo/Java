package p2023_07_14;

public class For03 {
	public static void main(String[] args) {
		int odd = 0, even = 0;
		
		//홀수의 합
		for (int i = 1; i <= 100; i += 2)
			odd += i;
		//짝수의 합
		for (int i = 0; i <= 100; i += 2)
			even += i;
		System.out.println("1~100 홀수의 합 : " + odd);
		System.out.println("1~100 짝수의 합 : " + even);
	}
}
