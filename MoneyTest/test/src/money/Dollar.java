package money;

public class Dollar {
    int amount;
     Dollar (int amount) {
        this.amount = amount;
    }
     Dollar times(int multiplier) {     //メソッドtimes 生成
        return  new Dollar(amount*multiplier);
    }

}


