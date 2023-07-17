package p2023_07_17;

public class Continue01 {
    public static void main(String[] args) {
        // continue문
        // 1. 반복문 안에서 사용되며, 다시 반복문으로 돌아가라는 의미
        // 2. continue문이 실행되면, continue문 아래의 문장 실행 X
        for (int i = 1; i <= 10; i++){
            if(i == 5) continue;
            System.out.println("put : " + i);
        }
    }
}
