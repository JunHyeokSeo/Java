package p2023_08_04.threadEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat sf = 
			new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		while(true){
			Date d = new Date();
			System.out.println(sf.format(d));
			try{
				Thread.sleep(1000);	// 1초 동안 block상태로 빠짐
			}catch(Exception e){	
				e.printStackTrace();
			}			
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx tx = new ThreadEx();
		Thread t = new Thread(tx);
		t.start();
	}

}
