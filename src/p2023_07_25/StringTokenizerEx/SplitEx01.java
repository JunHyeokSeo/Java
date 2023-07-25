package p2023_07_25.StringTokenizerEx;

public class SplitEx01 {
	public static void main(String[] args) {
		String text = "홍길동&홍길순,김길동,김자바-안화수";
		String[] names = text.split("&|,|-");

		for (String name : names)
			System.out.println(name);
	}
}
