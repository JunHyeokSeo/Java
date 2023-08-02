package p2023_08_02.accountingEx;

public class AccountingVO {
	//필드 정의 및 Getter, Setter 정의
	private String id;
	private String pw;
	private String name;
	private int age;
	private String email;
	private String location;
	private boolean loginState;

	public AccountingVO(String id, String pw, String name, int age, String email, String location) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.email = email;
		this.location = location;
		this.loginState = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean getLoginState() {
		return loginState;
	}

	public void setLoginState(boolean loginState) {
		this.loginState = loginState;
	}

	public String getField(){
		String rv = "이름 : " + name + " 나이 : " + age + " 이메일 : " + email + " 주소 : " + location;
		return rv;
	}
}
