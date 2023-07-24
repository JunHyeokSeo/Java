package p2023_07_24;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//1. Date
		// 시간 포멧을 변경하는 자체적인 기능은 없다
		// Mon Jul 24 11:08:59 KST 2023
		Date d = new Date();

		// 포멧 변경을 위한 클래스를 추가 simpleDataFormat
		// 년, 월, 일, 시, 분, 초, 요일 형태
		// HH : 24시간제
		// hh : 12시간제 / a : 오전/오후를 나타냄
		// EEE : 요일, 세개를 사용하는 것이 원칙이지만 하나만 사용해도 가능
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss (E)");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss (E)");

		// 기본 Data format (반환값 long)
		System.out.println(d);
		// 부모 클래스인 DataFormat 클래스의 format 메소드를 사용
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));

		// 2. Timestamp (반환값 long)
		// 기본생성자가 없음, 매개변수가 long형인 생성자를 기본적으로 사용함
		// OS의 날짜 정보를 1/1000초 까지 구해오는 정적 메소드, Systme.CurrentRimeMillis()
		// 마찬가지로 SimpleDataFormat 적용 가능
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(sf.format(ts));
	}
}
