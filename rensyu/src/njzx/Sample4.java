package njzx;

public class Sample4 {
    public static void main(String[] args) {
        double a, b, c;
        int x, y, z , m;
        char moji;
        int code;

        // double型の演算結果をint型の変数に格納する
        a = 10.0;
        b = 3.0;
        m=(int)a;
        System.out.println("m = " + m);
        z = (int)(a / b);  // キャストが必要
        System.out.println("z = " + z);

        // int型の演算結果をdouble型の変数に格納する
        x = 10;
        y = 3;
        c = (double)(x / y);  // キャストは不要だが、キャストした方がよい
        System.out.println("c = " + c);

        // char型のデータをint型の変数に格納する（文字Aの文字コードを表示する）
        moji = 'A';
        code = (int)moji;  // キャストは不要だが、キャストした方がよい
        System.out.println("文字コード = " + code);

        // int型のデータをchar型の変数に格納する（文字コード70の文字を表示する）
        code = 70;
        moji = (char)code;  // キャストが必要
        System.out.println("文字 = " + moji);
    }
}