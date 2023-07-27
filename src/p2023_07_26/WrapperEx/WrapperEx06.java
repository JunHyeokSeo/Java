package p2023_07_26.WrapperEx;

public class WrapperEx06 {
	public static void main(String[] args) {
		//Default Type to String

		// Solv 1. without Wrapper Class
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(20.0);
		String str3 = String.valueOf(true);

		// Solv 2. Using Wrapper Class
		Integer num = new Integer(30);
		String str4 = num.toString();

		// Solv 3. Using feature of String Class
		String str5 = 40 + "";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}
