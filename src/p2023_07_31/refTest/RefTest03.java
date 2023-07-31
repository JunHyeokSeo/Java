package p2023_07_31.refTest;

//* 다운 캐스팅(강제 형변환)
//1. 슈퍼클래스에서 서브클래스로 형변환 하는것
//2. 참조 가능한 영역이 확대가 된다.
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
//   때문에 자료형을 생략할 수 없다.(강제 형변환)

class Parent03 {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03(); // 업캐스팅(자동 형변환)
		p.parentPrn();	// 부모가 상속해준 메소드만 호출 가능함
//		p.childPrn();	// 부모가 상속 해주지 않는 메소드는 호출할 수 없다.
		
		Child03 c; 	    // 서브 클래스로 레퍼런스 변수 선언		
		c = (Child03) p;    // 강제 형변환으로 다운 캐스팅
		
		// 다운 캐스팅이 되면 상속받은 메소드(parentPrn())와 자기 클래스의 
		// 메소드(childPrn()) 2개의 메소드 모두 호출해서 사용할 수 있다.
		// 참조 가능한 영역의 확대가 일어난다.
		Child03 c1 = (Child03) p;  // 다운 캐스팅(강제 형변환)		
		c.parentPrn();		
		c.childPrn();
	}
}




