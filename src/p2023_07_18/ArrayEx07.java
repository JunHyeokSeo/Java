package p2023_07_18;

public class ArrayEx07 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("값의 수가 부족합니다");
            System.exit(0);
        }
        //Java는 args[0]부터 입력 문자열을 나타낸다.
        //args[0]이 프로그램 이름을 나타내는 C언어와는 다름
        String strNum1 = args[0];
        String strNum2 = args[1];
        //문자열 -> 정수 형변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
    }
}
