package p2023_07_14;

public class If05 {
	public static void main(String[] args) {
		// 난수 발생 공식
		// 난수 발생:	0.0 <= Math.random() < 1.0
		System.out.println(Math.random());
		
		// 난수 = (정수화) Math.random() * (상한값 - 하한값 + 1) + 하한값
		int num = (int) (Math.random() * 6) + 1;
		if (num == 1)
			System.out.println("1번이 나왔습니다.");
		else if (num == 2)
			System.out.println("2번이 나왔습니다.");
		else if (num == 3)
			System.out.println("3번이 나왔습니다.");
		else if (num == 4)
			System.out.println("4번이 나왔습니다.");
		else if (num == 5)
			System.out.println("5번이 나왔습니다.");
		else
			System.out.println("6번이 나왔습니다.");
		
		System.out.println("1~45사이의 난수 발생");
		int r = (int) (Math.random() * 45) + 1;
		System.out.println("난수: " + r);
	}
}
