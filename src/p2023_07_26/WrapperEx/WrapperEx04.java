package p2023_07_26.WrapperEx;

public class WrapperEx04 {
	public static void main(String[] args) {
		Double d1 = new Double(3.14);            //Boxing
		Double d2 = 3.14;

		double n1 = d1.doubleValue();                  //Unboxing
		double n2 = d2;

		// String to double
		Double d3 = new Double("3.14");
//		Double d4 = "3.14"; // 문자열은 자동 박싱 X

		double n3 = d3.doubleValue();
		double n4 = d3;

		// String to double
		double num = Double.parseDouble("42.195");
		System.out.println("num = " + num);
	}
}
