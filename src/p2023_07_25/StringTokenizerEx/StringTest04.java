package p2023_07_25.StringTokenizerEx;

import java.util.*;

class StringTest04 {

  public static void main(String[] args) {
    StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");

//		try {
//			System.out.println(str.nextToken());
//			System.out.println(str.nextToken());
//			System.out.println(str.nextToken());
//			System.out.println(str.nextToken());
//			System.out.println(str.nextToken()); //오류 발생
//		}
//		catch (Exception e){                     //예외 처리 가능
//			System.out.println("wrong");
//		}

	//파싱된 문자열이 모두 몇 개인지 되는지 알려줌
    int cnt = str.countTokens();
    System.out.println("파싱할 문자열의 총갯수-> " + cnt);

    while(str.hasMoreTokens()){ //토큰이 있으면
      System.out.println(str.nextToken());//차례대로 파싱된 문자열을 얻어온다.
	}
  }  // main() end
}      