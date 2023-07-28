package p2023_07_28;

interface IHello01 {					// 인터페이스	
	void sayHello(String name);  // 추상메소드(public abstract 생략)
}

//1.인터페이스를 상속 받을때는 implements로 상속 받는다.
//2.부모 인터페이스를 상속을 받으면, 부모 인터페이스 안에 있는 추상 메소드를 
//  자식 구현 클래스에서 반드시 메소드 오버라이딩을 해야 한다. 
class Hello01 implements IHello01 {
	@Override
	public void sayHello(String name) {	// 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println(name + "씨 안녕하세요!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		IHello01 ih = new IHello01();    // 오류발생
		
		Hello01 obj = new Hello01();
		obj.sayHello("홍길동");    // 메소드 오버라이딩된 메소드가 호출됨
		obj.sayHello("이순신");
	}
}
