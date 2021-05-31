package njzx;
import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;

        // 西暦をキーボード入力する
        System.out.print("西暦を入力してください = ");
        year = scn.nextInt();


        // うるう年かどうかを判定する
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("うるう年です");
        }
        else {
            System.out.println("うるう年ではありません。");
        }
    }
}