package p2023_08_02.accountingEx;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountingSVC {
	// 기능 함수 정의
	ArrayList<AccountingVO> list = new ArrayList<>();
	ArrayList<Boolean> loginState = new ArrayList<>();

	//회원 삽입
	void insertMember(Scanner sc){
		System.out.println("[회원가입]");
		System.out.println("회원 ID 입력");
		String id = sc.nextLine();

		System.out.println("회원 PW 입력");
		String pw = sc.nextLine();

		System.out.println("[회원 정보 입력]");
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.print("이메일 : ");
		String email = sc.nextLine();

		System.out.print("주소 : ");
		String location = sc.nextLine();

		list.add(new AccountingVO(id, pw, name, age, email, location));
	}

	//회원 목록 확인
	void checkMemberList(){
		System.out.println("[회원 목록 출력]");
		int i = 1;
		for (AccountingVO tmp : list) {
			System.out.println("[" + i++ + ".] " + tmp.getField());
		}
		System.out.println("---------------------------------------");
	}

	//로그인 기능 구현
	boolean login(Scanner sc){
		if (list.size() < 1){
			System.out.println("회원이 없습니다.");
			return false;
		}
		System.out.println("[로그인]");
		System.out.println("ID를 입력하세요");
		String id = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			AccountingVO accountingVO = list.get(i);
			if(accountingVO.getId().equals(id)){
				System.out.println("PW를 입력하세요");
				String pw = sc.nextLine();
				if (accountingVO.getPw().equals(pw)){
					System.out.println("로그인에 성공했습니다");
					list.get(i).setLoginState(true);
					return true;
				}
				else{
					System.out.println("PW가 틀렸습니다");
					return false;
				}
			}
		}
		System.out.println("일치하는 ID가 없습니다");
		return false;
	}

	//로그아웃 기능 구현
	void logout(Scanner sc){
		if (list.size() < 1){
			System.out.println("회원이 없습니다.");
			return ;
		}
		System.out.println("로그아웃 할 회원의 ID를 입력하세요");
		String id = sc.nextLine();
		AccountingVO accountingVO;
		for (int i = 0; i < list.size(); i++){
			accountingVO = list.get(i);
			if (accountingVO.getId().equals(id)){
				if (accountingVO.getLoginState() == false){
					System.out.println("이미 로그아웃 상태입니다");
					return;
				}
				accountingVO.setLoginState(false);
				System.out.println("로그아웃 했습니다");
				return;
			}
		}
		System.out.println("일치하는 ID가 없습니다");
	}

	//회원 정보 수정
	void modifyMember(Scanner sc){
		if (!isThereMember()) return;
		checkMemberList();
		System.out.println("수정할 회원의 번호를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		if (!temp(sc, num)) return;
		System.out.println("[수정 정보 입력]");
		System.out.print("이름 : ");
		list.get(num - 1).setName(sc.nextLine());

		System.out.print("나이 : ");
		list.get(num - 1).setAge(Integer.parseInt(sc.nextLine()));

		System.out.print("이메일 : ");
		list.get(num - 1).setEmail(sc.nextLine());

		System.out.print("주소 : ");
		list.get(num - 1).setLocation(sc.nextLine());
		System.out.println("---------------------------------------");
		System.out.println("[수정이 완료되었습니다]");
		checkMemberList();
	}

	//회원 번호 확인 및 로그인 여부 확인
	boolean temp(Scanner sc, int num){
		if (num < 1 || num > list.size()){
			System.out.println("회원 번호를 잘못 입력했습니다.");
			return false;
		}
		if (list.get(num - 1).getLoginState() == false){
			System.out.println("로그인을 하신 후 이용할 수 있습니다");
			if (!login(sc)){
				return false;
			}
		}
		return true;
	}

	boolean isThereMember(){
		if (list.size() < 1){
			System.out.println("회원이 없습니다.");
			return false;
		}
		return true;
	}

	//회원 삭제
	void deleteMember(Scanner sc){
		if (!isThereMember()) return;
		checkMemberList();
		System.out.println("삭제할 회원의 번호를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		if (!temp(sc, num)) return;
		list.remove(num - 1);
		System.out.println("---------------------------------------");
		System.out.println("[삭제가 완료되었습니다]");
		checkMemberList();
	}
}
