package p2023_07_18;

public class ArrayEx01 {
    public static void main(String[] args) {
        //배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
        //변수 -> 배열 -> 자료구조(List)

        //형식 1. - 값 지정 X
        //int, 0 초기화
        int[] score = new int[3];
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        score[0] = 80;
        score[1] = 90;
        score[2] = 100;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

        //double, 0.0 초기화
        double[] d = new double[3];
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        char[] c = new char[3];
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        boolean[] b = new boolean[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        String[] str = new String[3];
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        str[0] = "java";
        str[1] = "oracle";
        str[2] = "spring";
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);

        //형식 2. - 값 지정 O
        int[] i1 = {80, 90, 100};
        int[] i2 = new int[]{80, 90, 100};
        System.out.println(i1[0]);
        System.out.println(i1[1]);
        System.out.println(i1[2]);
        System.out.println(i1.length);  //속성이기 때문에 괄호 없음
        for (int i = 0; i < i1.length; i++)
            System.out.print(i1[i] + "\t");
        System.out.println();

        double[] dd = {3.14, 10.5, 42.195, 50};
        for (int i = 0; i < dd.length; i++)
            System.out.print(dd[i] + "\t");
        System.out.println();

        char[] cc = {'j', 'a', 'v', 'a', '자', '바'};
        for (int i = 0; i < cc.length; i++)
            System.out.print(cc[i] + "\t");
        System.out.println();

        boolean[] bb = {true, false, true};
        for (int i = 0; i < bb.length; i++)
            System.out.print(bb[i] + "\t");
        System.out.println();

        String[] str1 = {"java", "oracle", "Spring", "Python", "Tenserflow"};
        String[] str2 = {"junhseo", "kakao", "backend"};
        for (int i = 0; i < str1.length; i++)
            System.out.print(str1[i] + "\t");
        System.out.println();
        for (int i = 0; i < str2.length; i++)
            System.out.print(str2[i] + "\t");
        System.out.println();
    }
}
