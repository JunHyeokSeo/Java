package p2023_07_26.WrapperEx;

public class WrapperEx01 {
	public static void main(String[] args) {
		// Integer 클래스는 기본 생성자를 지원하지 않음
		// Integer(String str), Integer(int i) 두 가지 형식만 지원

		//박싱(boxing) : stack 메모리의 값을 heap 메모리에 복사하는 것
		int n1 = 10;                            //지역변수 (stack 영역)
		Integer num = new Integer(n1);          //박싱 (boxing)

		//언박싱(unboxing) : heap 메모리의 데이터를 stack 메모리로 가져오는 것
		int n2 = num.intValue();
		System.out.println(n2);

		//String은 원래 heap 메모리에 존재,
		//heap to heap이기 때문에 박싱이라고 말하기 모호하나 박싱이라고 정의함
		String str = "20";
		Integer num1 = new Integer(str);        //박싱
		int n3 = num1.intValue();               //언박싱
	}
}
