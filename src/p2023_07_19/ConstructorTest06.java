package p2023_07_19;

class MyDate06 {
	private int year;
	private int month;
	private int day;

	public MyDate06(int year, int month, int day) {
		this.year = year;  // 2023
		this.month = month;  // 7
		this.day = day; // 19
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}

	//Getter
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}

	//Setter
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		System.out.println("[before]");
		d.print();
		d.setYear(2024);
		d.setMonth(10);
		d.setDay(25);
		System.out.println("[after]");
		d.print();
		System.out.println("return year \t: " + d.getYear());
		System.out.println("return month \t: " + d.getMonth());
		System.out.println("return day \t\t: " + d.getDay());
	}
}
/*
public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		Scanner sc = new Scanner(System.in);
		int menu, sub, value;
		while (true) {
			System.out.println("choose menu");
			System.out.println("1.edit 2.exit");
			menu = sc.nextInt();
			if (menu == 1){
				System.out.println("1.Year 2.Month 3.Day");
				sub = sc.nextInt();
				if (sub == 1){
					System.out.println("edit Year, please input value");
					value = sc.nextInt();
					d.setYear(value);
				}
				else if (sub == 2){
					System.out.println("edit Month, please input value");
					value = sc.nextInt();
					d.setMonth(value);
				}
				else if (sub == 3){
					System.out.println("edit Day, please input value");
					value = sc.nextInt();
					d.setDay(value);
				}
			}
			else {
				System.out.println("turn off");
				break;
			}
			System.out.println("complete!");
			d.print();
			System.out.println();
		}
	}
}
 */