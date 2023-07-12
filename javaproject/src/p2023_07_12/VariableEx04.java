package p2023_07_12;

// p68
// float형과 double형 차이점
public class VariableEx04 {
	public static void main(String[] args) {
		// 실수값 저장
//		float var1 = 3.14;	//컴파일 오류(float != double)
		float var1 = (float) 3.14;	//명시적 형변환
		float var2 = 3.14f;
		double var3 = 3.14;		
		
		// 정밀도 테스트
		// float : 소수점 이하 7자리까지 정밀도를 가짐
		// double : 소수점 이하 15자리까지 정밀도를 가짐
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);	//var4 보다 2배 이상 정밀
		
		//e 사용하기
		double var6 = 3e6;	// 10의 6승
		float var7 = 3e6f;
		double var8 = 2e-3;	// 10의 -3승
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}
}
