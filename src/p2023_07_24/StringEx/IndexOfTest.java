package p2023_07_24.StringEx;

public class IndexOfTest {
	public static void main( String[] args ) {
	//indexOf() : 특정 문자의 인덱스 반환(int)
	String message = "Java program creates many objects.";

	//가장 먼저 나오는 'a'
	int index1 = message.indexOf( 'a' );
	int index2 = message.indexOf( 97 );

	System.out.println( index1 );
	System.out.println( index2 );

	//index번호 13번째 이후에서 a를찾음
	int index3 = message.indexOf( 'a', 13 ); 
	System.out.println( index3 );

	int index4 = message.indexOf( "av" );
	System.out.println( index4 );

	int index5 = message.indexOf( "man", 12 );
	System.out.println( index5 );

	//찾는 문자가 없을 때, -1 반환
	int index6 = message.indexOf( "java" );
	System.out.println( index6 );
    }
}



