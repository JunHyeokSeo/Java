package p2023_07_17;

public class MethodEx02 {
    //1-n까지의 합
    static void sum(int n){
        int num = 0;
        for (int i = 1; i <= n; i++) num += i;
        System.out.println("i~" + n + "=" + num);
    }
    public static void main(String[] args) {
        sum(3);
        sum(5);
        sum(10);
        sum(30);
        sum(100);
        sum(1000);
        sum(10000);
    }
}
