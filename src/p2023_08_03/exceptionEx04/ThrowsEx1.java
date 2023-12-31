package p2023_08_03.exceptionEx04;

public class ThrowsEx1 {

	public void setData(String n) throws NumberFormatException{
		if(n.length() >= 1){
			String str = n.substring(0,1);
			printData(str);
		}
	}

	private void printData(String n) throws NumberFormatException{
		int dan = Integer.parseInt(n);
		System.out.println(dan+"단");
		System.out.println("-----------");
		for(int i=1 ; i<10 ; i++)
			System.out.println(dan+"*"+i+"="+(dan*i));
	}

	public static void main(String[] args){
		ThrowsEx1 t1 = new ThrowsEx1();

		try{
			t1.setData(args[0]);
		}catch(Exception e){
			System.out.println("첫문자가 숫자가 아닙니다.");
		}
	}//main() end

  }
