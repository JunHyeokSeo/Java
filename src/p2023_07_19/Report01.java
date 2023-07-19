package p2023_07_19;

public class Report01 {
	public static void main(String[] args) {
		int[][] arr = new int[8][9];

		for (int i = 2; i <= 9; i++){
			for (int j = 1; j <= 9; j++){
				arr[i - 2][j - 1] = i * j;
			}
		}
		for (int i = 2; i <= 9; i++){
			System.out.printf("[%d단]\n", i);
			for (int j = 1; j <= 9; j++){
				System.out.printf("%d * %d = %d\n", i, j, arr[i - 2][j - 1]);
			}
			System.out.println();
		}
	}
}
