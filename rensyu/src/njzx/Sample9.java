package njzx;

import java.util.Scanner;

public class Sample9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] score = new int[5];
        int i, sum;
        double ave;

        // 配列にテストの得点を格納する
        for (i = 0; i < score.length; i++) {
            System.out.print("得点を入力してください = ");
            score[i] = scn.nextInt();
        }

        // テストの得点の合計値を求める
        sum = 0;
        for (i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // テストの得点の平均値を求める
        ave = sum / (double)score.length;

        // テストの得点の平均値を表示する
        System.out.println("平均値 = " + ave);
    }
}