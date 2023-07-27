package p2023_07_26;

public class report {
	public static void main(String[] args) {
		int[] arr = new int[46];
		int count = 0;
		
		while (count < 6){
			int rn = (int) (Math.random() * 45) + 1;
			if (arr[rn] == 0){
				System.out.println(rn);
				arr[rn] = 1;
				count++;
			}
		}
	}
}
