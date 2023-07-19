package p2023_07_19;

class Car{
	//필드(filed)
	String company = "현대자동차";
	String model = "그렌저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
}

//Main 메소드를 가진 클래스명과 파일명을 일치시켜야 함
//public 키워드는 하나의 클래스만 가질 수 있음 (Main 메소드를 가지는 클래스만 public 사용가능)
public class CarExample {
	public static void main(String[] args) {
		//객체 생성 + 초기값 확인
		Car myCar = new Car();
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}
