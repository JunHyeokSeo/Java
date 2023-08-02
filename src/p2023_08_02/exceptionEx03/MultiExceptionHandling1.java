package p2023_08_02.exceptionEx03;

// try ~ catch ~ finally 형식
// finally를 사용하여 파일을 닫거나 DB와의 연결을 해제한다 (웹 프로그래밍에서 일반적인 사용)
// file.close(), con.close()

public class MultiExceptionHandling1 {
	public static void main(String[] args) {
		int value = 20;
		int div = 0;

		int[] intArray = {1, 2, 3};

		try {
			// 두수의 나눗셈을 구함
			// ArithmeticException : 0으로 나눌 때 발생
//			int result = value / div;
//			System.out.println(result);


			// 배열의 특정 값을 저장
			// ArrayIndexOutOfBoundsException : 배열 범위를 넘어선 참조
			int arrayValue = intArray[4];
			System.out.println(arrayValue);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("0으로 나눌 수 없음");
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("배열 범위를 벗어남");
		} finally {
			System.out.println("예외가 발생했음!");
		}
	}
}



