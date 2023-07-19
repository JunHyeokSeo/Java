package p2023_07_19;

public class Animal {   // 사용자 정의 클래스
	int age; //필드(field), 멤버변수, 전역변수 : heap 메모리에 저장

	public Animal(){    //기본 생성자(Default Constructor) : 매개변수 없는 형태
		System.out.println("생성자 호출 성공");
	}
	public static void main(String[] args) {
		int a = 10;     // 지역변수 : Stack 영역에 저장

		String str = new String("Java");
		Animal ani1 = new Animal();
		System.out.println(ani1.age);
		ani1.age = 5;
		System.out.println(ani1.age);

		Animal ani2 = new Animal();
		System.out.println(ani2.age);

		if (ani1 == ani2) System.out.println("같은 주소");
		else System.out.println("다른 주소");
	}
}
