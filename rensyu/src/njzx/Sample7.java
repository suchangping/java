package njzx;

import java.util.Scanner;

public class Sample7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;


        // 2つの整数をキーボード入力する
        System.out.print("1つ目の整数を入力してください = ");
        a = scn.nextInt();
        System.out.print("2つ目の整数を入力してください = ");
        b = scn.nextInt();

        // 最大公約数を求める
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }

        // 最大公約数を表示する
        System.out.println("最大公約数 = " + a);
    }
}