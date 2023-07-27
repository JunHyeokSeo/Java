package p2023_07_26;

class TestClass01 {
	private int member; //private 접근제어자, 외부 클래스에서 직접 참조 불가능
	public void setValue(int value){
		member = value;
	}
	public int getValue( ){
		return member;
	}
}
class GenericTest01{
	public static void main(String[] args) {
		TestClass01 obj01 = new TestClass01();
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue( ));
//		obj01.setValue(3.4);
//		System.out.println("되돌리는 값은->" + obj01.getValue( ));
//		obj01.setValue("이해할 수 있다.");
//		System.out.println("되돌리는 값은->" + obj01.getValue( ));
	}
}                                                                                    
