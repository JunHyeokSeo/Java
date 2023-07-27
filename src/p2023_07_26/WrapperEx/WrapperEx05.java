package p2023_07_26.WrapperEx;

public class WrapperEx05 {
	public static void main(String[] args) {
		//String to Default Type(int, double ...)
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		boolean value4 = Boolean.parseBoolean("TEST");

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);   //true
		System.out.println("value4 : " + value4);   //false
	}
}
