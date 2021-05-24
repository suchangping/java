package njzx;
import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String month;

        // 月をキーボード入力する
        System.out.print("月を入力してください = ");
        month =scn.nextLine();
        // 季節を判定する
        switch (month) {
            case "A":
            case "B":
            case "C":
                System.out.println("春です。");
                break;
            case "D":
            case "E":
            case "F":
                System.out.println("夏です。");
                break;

            default:
                System.out.println("入力エラーです！");
                break;
        }
    }
}