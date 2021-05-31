package Book;

public class Main {
    public  static  void main(String[] args) {
       Sword s =new Sword();
       s.name ="A剣";
       s.damage=10;
       Hero h =new Hero();
       h.name ="ミサト";
       h.hp=100;
       h.sword=s;
       System.out.println("現在の武器は"+h.sword.name);

    }
}
