package p2023_07_14;

public class While02 {
	public static void main(String[] args) {
		//while문을 이용해서 1부터 100까지 홀수, 짝수의 합을 구하라
		//while문 한개와 if~else문으로 작성
		int odd = 0, even = 0, i = 1;
		while(i <= 100) {
			if (i % 2 == 1) odd += i;
			else even += i;
			i++;
		}
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);
	}
}
