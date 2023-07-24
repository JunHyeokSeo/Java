package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Report {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

		int y = c.get(Calendar.YEAR);           // 연 : 2023
		int m = c.get(Calendar.MONDAY) + 1;     // 월 : 0 ~ 11
		int d = c.get(Calendar.DATE);           // 일
		int h1 = c.get(Calendar.HOUR);          // 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);   // 24시간
		int ap = c.get(Calendar.AM_PM);         // 0: 오전 / 1: 오후
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		int dw = c.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.printf("%d-%d-%d\n", y, m, d);

		System.out.println("[12시간제]");
		if (ap == 0) System.out.print("오전, ");
		else System.out.print("오후, ");
		System.out.printf("%d시 %d분 %d초 (%s)\n", h1, mm, s, day_of_week[dw]);

		System.out.println("[24시간제]");
		System.out.printf("%d시 %d분 %d초 (%s)\n", h2, mm, s, day_of_week[dw]);
	}
}
