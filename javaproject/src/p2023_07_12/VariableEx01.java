package p2023_07_12;

//p53
// x, y 변수의 값을 서로 교환하는 예제
public class VariableEx01 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
