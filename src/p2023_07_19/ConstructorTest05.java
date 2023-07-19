package p2023_07_19;

class MyDate05{
	private int year;
	private int month;
	private int day;

	//기본 생성자 명시적으로 작성하는 것 필요
	//생성자가 이미 존재? 기본 생성자를 자동으로 만들지 않음
	public MyDate05(){
	}

	public MyDate05(int new_year, int new_month, int new_day){
		year=new_year;
		month=new_month;
		day=new_day;
	}

	//초기화 불가능 (매개변수 이름과 필드의 이름이 같을 때)
	//this 키워드 사용하여 해결
//	public MyDate05(int year, int month, int day){
//		this.year=year;
//		this.month=month;
//		this.day=day;
//	}

	public void print(){
		System.out.println(year+ "/" +month+ "/" +day);
	}
}
public class ConstructorTest05 {
	public static void main(String[] args) {
		//기본 생성자 호출
		MyDate05 d=new MyDate05();
		d.print();

		MyDate05 d2=new MyDate05(2023, 7, 19);
		d2.print();
	}
}      