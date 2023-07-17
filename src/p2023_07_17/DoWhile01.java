package p2023_07_17;
public class DoWhile01 {
    public static void main(String[] args) {
        //do-while문으로 '사랑해요' 메세지를 10번 출력
        //do-while문은 조건식이 거짓인 경우에도, 최소 한번1 실행
        int i = 1;
        do {
            System.out.println(i + "사랑해요");
            i++;
        }while (i <= 10);
    }
}
