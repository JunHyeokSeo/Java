package p2023_07_17;

public class Break03 {
    public static void main(String[] args) {
        int loop = 0;
        while (true){
            int num = (int) (Math.random() * 6) + 1;
            loop++;
            System.out.println(num);
            if (num == 6) break;

        }
        System.out.println("loop : " + loop);
        System.out.println("terminated");
    }
}
