//package p2023_08_02.accountingEx;
//
//import java.util.Scanner;
//
////switch-case문 통한 메뉴 출력 구현
//public class AccountingMain {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		boolean loop = true;
//		AccountingSVC accountingSVC = new AccountingSVC();
//		while (loop){
//			System.out.println("[Accounting System]");
//			System.out.println("1. 회원 정보 입력");
//			System.out.println("2. 회원 목록 확인");
//			System.out.println("3. 회원 정보 수정");
//			System.out.println("4. 회원 정보 삭제");
//			System.out.println("5. 회원 로그아웃");
//			System.out.println("6. 프로그램 종료");
//			String menu = sc.nextLine();
//			switch (menu){
//				case "1":
//					accountingSVC.insertMember(sc);
//					break;
//				case "2":
//					accountingSVC.checkMemberList();
//					break;
//				case "3":
//					accountingSVC.modifyMember(sc);
//					break;
//				case "4":
//					accountingSVC.deleteMember(sc);
//					break;
//				case "5":
//					accountingSVC.logout(sc);
//					break;
//				case "6":
//					loop = false;
//					break;
//			}
//		}
//	}
//}
