package njzx;
public class Sample3 {
    public static void main(String[] args) {
        String s1, s2, s3;
        char c1, c2, c3;

        // 文字列を格納する
        s1 = "01ABCDEFG";
        s2 = "あいうえお";

        // 文字列を連結する
        s3 = s1 + s2;
        System.out.println(s3);

        // 文字列の長さを表示する
        System.out.println("s1の長さ = " + s1.length());
        System.out.println("s2の長さ = " + s2.length());
        System.out.println("s3の長さ = " + s3.length());

        // 文字列の中から1文字を取得する
        c1 = s1.charAt(0);
        c2 = s2.charAt(3);
        c3 = s3.charAt(8);
        System.out.println("s1の先頭の文字 = " + c1);
        System.out.println("s2の4番目の文字 = " + c2);
        System.out.println("s3の9番目の文字 = " + c3);
    }
}