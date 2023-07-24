package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		//Calendar  객체 생성 방법
		/*
			1. 생성자 사용 - 오류 발생
				Calendar c = new Calendar();
			2. 자식 클래스의 생성자 사용, 업캐스팅
				Calendar c = new GregorianCalendar();
			3. 인스턴스 생성 메소드 사용
				Calendar c = Calendar.getInstance();
		*/
		//Unix 시간을 가짐 - Unix 생성 후 얼마나 흐른 시점인지 초 단위로 표현
		Calendar c = Calendar.getInstance();
//		System.out.println(Calendar.YEAR); //1 - 정적 필드 값

//		y = c.get(1); // 아래 방법과 같은 동작 - but 사용자가 1 = year 2 = month 등의 정보를 기억하기 힘들기 때문에, 정적 필드를 매개변수로 사용
		int y = c.get(Calendar.YEAR);           // 연 : 2023
		int m = c.get(Calendar.MONDAY) + 1;     // 월 : 0 ~ 11
		int d = c.get(Calendar.DATE);           // 일
		int h1 = c.get(Calendar.HOUR);          // 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);   // 24시간
		int ap = c.get(Calendar.AM_PM);         // 0: 오전 / 1: 오후
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d\n", y, m, d);
		if (ap == 0) System.out.print("오전 ");
		else System.out.print("오후 ");
		System.out.printf("%d:%d:%d", h1, mm, s);
		System.out.printf("%d:%d:%d\n", h2, mm, s);
	}
}
