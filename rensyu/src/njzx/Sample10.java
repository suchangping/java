package njzx;

public class Sample10 {
    public static void main(String[] args) {
        int max, min, i, num;

        // コマンドライン引数の中から最大値と最小値を求める
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for (i = 0; i < args.length; i++) {
            num = Integer.parseInt(args[i]);
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }

        // 最大値と最小値を表示する
        System.out.println("最大値 = " + max);
        System.out.println("最小値 = " + min);
    }
}