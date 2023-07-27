package p2023_07_26;

class TestClass02 {
	private Object member;
	public void setValue(Object value){
		member = value;
	}
	public Object getValue( ){
		return member;
	}
}
class GenericTest02{
	public static void main(String[] args) {
		TestClass02 obj01 = new TestClass02();
		
		//Object value = new Integer(3); : Boxing + UpCasting
		//Object value = 3;              : Auto Boxing + UpCasting
		obj01.setValue(3);
		System.out.println("되돌리는 값은->"+obj01.getValue( ));
		int n1 = ((Integer) obj01.getValue()).intValue();    //DownCasting + Unboxing
		int n2 = (Integer) obj01.getValue();                 //DownCasting + Auto Unboxing
		
		//Object value = new Double(3.4) : Boxing + UpCasting
		//Object value = 3.4             : Auto Boxing + Upcasting
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->"+obj01.getValue( ));
		double d1 = ((Double) (obj01.getValue())).doubleValue(); //DownCasting + Unboxing
		double d2 = ((Double) (obj01.getValue()));               //DownCasting + Auto Unboxing
		
		//Object value = new String("이해할 수 있다");             //UpCasting
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->"+obj01.getValue( ));
		String str1 = ((String) obj01.getValue());                //DownCasting
	}
}                                                                                    
