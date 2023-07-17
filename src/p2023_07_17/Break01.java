package p2023_07_17;

public class Break01 {
    public static void main(String[] args) {
        //무한루프 : for(;;)
        //break : 반복문 빠져 나오는 역할

        //100번 출력
        for (int i = 1;;i++){
            System.out.println(i + "무한출력");
            if (i == 100) break;
        }
    }
}
