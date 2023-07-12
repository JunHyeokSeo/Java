package p2023_07_12;

// p55
// 변수의 범위 : 지역 변수(local variable)
public class VariableEx02 {
	public static void main(String[] args) {
		
		// if문 안에서 정의된 지역변수 v2는 if문 안에서만 사용할 수 있다
		int v1 = 15;
		
		if (v1 > 10) {
			int v2;				// v2 : 지역변수
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;	//오류 발생
	}
}
