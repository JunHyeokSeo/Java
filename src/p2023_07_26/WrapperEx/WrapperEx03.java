package p2023_07_26.WrapperEx;

public class WrapperEx03 {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = 100;
		System.out.println("Unboxing : " + obj1.intValue());
		System.out.println("Auto Unboxing : " + obj1);

		int value1 = obj1.intValue();
		int value2 = obj2;
		int result = obj1 + 100;
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("result : " + result);
	}
}
