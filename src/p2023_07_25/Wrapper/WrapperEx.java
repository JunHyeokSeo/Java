package p2023_07_25.Wrapper;

public class WrapperEx {
	public static void main(String[] args) {

		//int형 변수의 최대값과 최소값
		System.out.println("max = " + Integer.MAX_VALUE);
		System.out.println("min = " + Integer.MIN_VALUE);

		//String to int
		int n = Integer.parseInt("20");
//		int n = Integer.parseInt("A"); // 오류
		System.out.println(n);
		System.out.println(n + 10);

		//decimal to binary
		//input : integer, return value : String
		System.out.println("binary : " + Integer.toBinaryString(10));

		//decimal to Oct
		System.out.println("Oct : " + Integer.toOctalString(10));

		//decimal to Hex
		System.out.println("Hex : " + Integer.toHexString(10));
	}
}
