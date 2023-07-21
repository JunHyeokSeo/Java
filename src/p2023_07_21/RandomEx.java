package p2023_07_21;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생 방법 : 1.Math.random()
//		        2.Random 클래스
		
		Random r1 = new Random();
		
		// 자동 import 단축키 : Ctrl + Shift + 오(o) 
		Random r = new Random();
		
		int n1 = r.nextInt(10);			// 0 ~ 9
		System.out.println("n1="+ n1);
		
		// 1 ~ 45 사이의 난수를 발생
		int n2 = r.nextInt(45) + 1;		// 1 ~ 45
		System.out.println("n2="+ n2);
		
		// 1 ~ 45 사이의 난수 6개 발생
		for(int i=1; i<=6; i++) {
			System.out.print(r.nextInt(45)+1+"\t");
		}
		System.out.println();
		
		// 0.0 <= Math.random() < 1.0 
		int n3 = (int)(Math.random() * 45) + 1; // 1 ~ 45
		System.out.println("n3="+ n3);
		
		// 1 ~ 45 사이의 난수 6개 발생
		for(int i=1; i<=6; i++) {
			System.out.print((int)(Math.random() * 45) + 1+"\t");
		}
		
	}

}
