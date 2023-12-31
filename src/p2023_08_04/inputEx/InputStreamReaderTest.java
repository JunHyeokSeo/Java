package p2023_08_04.inputEx;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		// byte Stream인 is 선언
		InputStream is = System.in;

		Scanner sc = new Scanner(System.in);
		
		// InputStreamReader 객체 선언
		InputStreamReader isr = new InputStreamReader(is);
//							InputStreamReader(System.in);
		int inputValue = 0;
		System.out.print("Input Value : ");
		try {
			// 키보드로 부터 데이터를 입력
			// 2바이트씩 읽어들이기 때문에 한글은 1자 밖에 입력이 안됨.
			// read() : 1byte 데이터(영문자)는 아스키코드로 입력을 받는다.
			// read() : 2byte 데이터(한글)는 유니코드로 입력을 받는다.
			inputValue = isr.read();
		} catch (IOException io) {
			System.out.print(io.getMessage());
		}
		// 입력받은 데이타를 출력
		System.out.println("Input Result : " + inputValue);
		System.out.println("Input Result : " + (char) inputValue);
	}
}
