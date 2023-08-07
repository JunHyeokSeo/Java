package p2023_08_04;

import java.io.*;

public class Report {
	public static void main(String[] args) {
		//      1. FileOutputStream 사용
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//		FileOutputStream fos = null;
		//		try {
		//			System.out.println("내용을 입력하세요");
		//			fos = new FileOutputStream("result.txt");
		//			fos.write(br.readLine().getBytes());
		//		} catch (IOException e) {
		//			throw new RuntimeException(e);
		//		}

		//      2. FileWriter 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("내용을 입력하세요");
			FileWriter fw = new FileWriter("result.txt");
			fw.write(br.readLine());
			fw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
