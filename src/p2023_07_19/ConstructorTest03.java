package p2023_07_19;

class MyDate03{
	private int year;
	private int month;
	private int day;
	public MyDate03(){ // 기본 생성자
		year=2023;
		month=7;
		day=19;
	}
	public void print(){
		System.out.println(year+ "/" +month+ "/" +day);
	}
}// MyDate03 end

public class ConstructorTest03 {
	public static void main(String[] args) {
		//변수 선언 시, 초기값 0/0/0 -> 생성자 호출 후, 2023/07/19
		MyDate03 d=new MyDate03();
		d.print();
		//필드 직접 접근은 오류 private
	}
}               