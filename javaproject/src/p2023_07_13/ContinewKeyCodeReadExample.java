package p2023_07_13;

import java.io.IOException;

public class ContinewKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if (keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}
}
