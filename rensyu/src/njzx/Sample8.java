package njzx;

import java.util.Scanner;

public class Sample8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, ans, count;

        // 乱数で1～100の数を選ぶ
        num = (int)(Math.random() * 100) + 1;

        // 数を当てるまで繰り返す
        count = 0;
        do {
            count++;
            System.out.print("いくつだと思います？ = ");
            ans = scn.nextInt();
            if (num > ans) {
                System.out.println("もっと大きいです。");
            }
            else if (num < ans) {
                System.out.println("もっと小さいです。");
            }
        } while (ans != num);


        // 正解と、当てるまでの回数を表示する
        System.out.println("正解は、" + num + "です。");
        System.out.println("あなたは、" + count + "回で正解しました！");
    }
}