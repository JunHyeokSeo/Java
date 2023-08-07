package p2023_08_03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report implements Runnable{
	public static void main(String[] args) {
		Report report = new Report();
		Thread thread = new Thread(report);
		thread.start();
	}

	@Override
	public void run() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss (E)");
		while (true){
			Date d = new Date();
			System.out.println(sd.format(d));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
