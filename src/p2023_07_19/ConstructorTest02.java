package p2023_07_19;

class MyDate02{
	private int year;
	private int month;
	private int day;

	public  MyDate02(){
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}
	public void print(){
		System.out.println(year+ "/" +month+ "/" +day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		MyDate02 d =  new MyDate02();
		d.print();
//		System.out.println(d.year); //private 접근제어자
//		MyDate dd =  new MyDate();
	}
} 