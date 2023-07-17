package p2023_07_17;

public class DoWhile02 {
    public static void main(String[] args) {
        //do-while문으로 1-100까지 홀수, 짝수의 합
        int odd = 0, even = 0, i = 1;
        do {
            if (i % 2 == 1) odd += i;
            else even += i;
        }while (i++ < 100);
        System.out.println("홀수의 합: " + odd);
        System.out.println("짝수의 합: " + even);
    }
}
