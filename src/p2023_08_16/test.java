package p2023_08_16;


public class test {
	public static void main(String[] args) {
		int[] arr = new int[46];
		int count = 0;

		while (count < 6) {
			int i = (int) (Math.random() * 45) + 1;
			if (arr[i] == 0){
				arr[i] = 1;
				System.out.println(i);
				count++;
			}
		}
	}
}
