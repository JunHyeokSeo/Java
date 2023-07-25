package p2023_07_25;

import java.util.Scanner;

public class inputValidationTest {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("input : ");
			int a = sc.nextInt();
		}
		catch (Exception e){
			System.out.println("worng input");
		}
	}
}
