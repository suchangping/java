package njzx;
import java.util.Scanner;

public class Sample11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[][] table = {
                { "曜日", "1", "2", "3", "4", "5" },
                { "月(1)", "国語", "算数", "理科", "社会", "英語" },
                { "火(2)", "算数", "英語", "体育", "国語", "保健" },
                { "水(3)", "社会", "英語", "算数", "技家", "技家" },
                { "木(4)", "理科", "算数", "理科", "体育", "社会" },
                { "金(5)", "国語", "算数", "理科", "美術", "美術" },
                { "土(6)", "英語", "数学", "国語" }
        };
        int day, time;

        // 時間割表全体を表示する
        for (day = 0; day < table.length; day++) {
            for (time = 0; time < table[day].length; time++) {
                System.out.print(table[day][time] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // 曜日と時間を指定して科目を表示する
        System.out.print("曜日（月～土を1～6で指定） = ");
        day = scn.nextInt();
        System.out.print("時間（1～5で指定） = ");
        time = scn.nextInt();
        System.out.println("科目 = " + table[day][time]);
    }
}