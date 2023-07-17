package p2023_07_17;

public class MethodEx01 {
    public static void check(){    //정적 메소드
        System.out.println("success calling method!");
    }

    public static void check(int a){
        System.out.println("전달된 값 : " + a);
    }

    public static void check(int a, double d){
        double result = a + d;
        System.out.println("전달된 값의 합 : " + result);
    }
    public static void check(char c){
        System.out.println("전달된 값 : " + c);
    }
    public static void check(boolean b){
        System.out.println("전달된 값 : " + b);
    }

    public static void check(String s){
        System.out.println("전달된 값 : " + s);
    }
    public static int check01(){
        return 50;  //메소드를 호출한 곳에 값을 반환
    }
    public static void main(String[] args) {
        check();
        check(10);
        check(10, 20.5);
        check('A');
        check(true);
        check(new String("자바"));

        check01(); //출력 없이 반환만 수행
        int result = check01();
        System.out.println("돌려받은 값 : " + result);
        System.out.println("돌려받은 값 : " + check01());
    }
}
