package p2023_07_17;
public class Break02 {
    public static void main(String[] args) {
        int i = 1;

        while (true){
            System.out.println(i + "무한출력");
            if (i == 100) break;
            i++;
        }
    }
}
