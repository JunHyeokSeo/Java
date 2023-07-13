package p2023_07_13;

public class ImplicitConversion {
    public static void main( String[] args ) {
    	
	// char 변수 선언 및 초기화.
	char charValue = 'a';
	System.out.println( "charValue = " + charValue );
 
	// int 변수 선언 및 'a'의 값으로 초기화.
	int intValueOfChar = charValue;	//자동 형변환 : char(2) -> int(4)
	System.out.println( "intValueOfChar = " + intValueOfChar );

	// int 변수 선언 및 초기화.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float 변수 선언 및 intValue 변수 값 할당
	// int와 float는 같은 크기이지만 float가 더 큰 자료형으로 취급됨
//	float floatValue = intValue;
	float floatValue = 30; // 자동 형변환 : int(4) -> float(4)	
	System.out.println( "floatValue = " + floatValue );

	// double 변수 선언및 floatValue,intValue 변수 값 할당
	double doubleValue1 = floatValue; // float(4) -> double(8)
	double doubleValue2 = intValue;
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end