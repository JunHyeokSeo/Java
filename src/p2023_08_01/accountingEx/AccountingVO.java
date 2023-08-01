package p2023_08_01.accountingEx;

public class AccountingVO {
	//필드 정의 및 Getter, Setter 정의
	private String name;
	private int age;
	private String phoneNum;
	private String location;

	public AccountingVO(String name, int age, String phoneNum, String location) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getField(){
		String rv = "이름 : " + name + " 나이 : " + age + " 연락처 : " + phoneNum + " 주소 : " + location;
		return rv;
	}
}
