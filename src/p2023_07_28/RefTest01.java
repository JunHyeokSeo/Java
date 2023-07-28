package p2023_07_28;

class Parent01{
	public void parentPrn( ){
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child01 extends Parent01{
	public void childPrn( ){
		System.out.println("서브 클래스 : Child01Prn 메서드");
	}
}

class RefTest01{
	public static void main(String[] args){
		Child01 c = new Child01();
		
		c.parentPrn();
		c.childPrn();
		
		Parent01 p;
		p = c;    //암시적으로 업 캐스팅이 일어남
		//  Parent01 p = new Chiled01(); // 업캐스팅
		
		p.parentPrn(); //업 캐스팅 후에는 부모로부터 상속받은 메서드만 호출할 수 있다,
		//  p.childPrn(); //컴파일 에러가 발생하게 된다.
	}
}       