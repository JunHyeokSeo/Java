package p2023_07_14;

public class Report02 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++)
			System.out.printf("[%d단]\t\t", i);
		System.out.println();
		for (int i = 1; i<= 9; i++) {
			for(int dan = 2; dan <= 9; dan++)
				System.out.printf("%d * %d = %d\t", dan, i, dan * i);
			System.out.println();
		}
	}
}
