package p2023_07_24.StringEx;

public class FindBlankIndex {
    public static void main( String[] args ) {
		
	String message = "Java program creates many objects.";
	
	// message의 길이를 구함.
	int len = message.length();

	System.out.println(len);  // len = 34;

	// message 중에서 ' '을 찾음
	for( int i=0 ; i<len ; i++ ) {
		//String의 i번째 인덱스의 char 값을 반환
	    char c = message.charAt( i );
		if( c == ' ' ) {
		    System.out.println( "index = " + i );
		}
	}//for end
    }
}
