package money;

public class Dollar {
    int amount;
     Dollar (int amount) {
        this.amount = amount;
    }
     void times(int multiplier) {     //メソッドtimes 生成
        amount *=multiplier;
    }

}


