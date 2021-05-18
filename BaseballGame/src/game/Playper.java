package game;

public class Playper {
    //int  atk;  //攻撃力
    //int def; //防御力
    //int handan= atk-def;

    int ball = new java.util.Random().nextInt(3) + 1;

    public void pitch() {

        switch (this.ball) {
            case 1:
                System.out.println("ボール投げました");
                break;
            case 2:
                System.out.println("デッドボール投げました");
                break;
            case 3:
                System.out.println("ストライク投げました");
        }
    }

    public void hit(Team team, int ball) {
        int balltype;

        if (this.ball == 1) {//ボール
            balltype = new java.util.Random().nextInt(2) + 1;
            switch (balltype) {
                case 1:
                    System.out.println("打ちました。");
                    break;
                case 2:
                    System.out.println("打ってないです。");
                    break;
                default:
                    break;

            }
        } else if (this.ball == 2) {
            System.out.println("進塁しました。");
            team.setBase(1);


        } else {
            balltype = new java.util.Random().nextInt(2) + 1;
            switch (balltype) {
                case 1:
                    System.out.println("打ちました。");
                    break;
                case 2:
                    System.out.println("打ってないです。");
                    break;
                default:
                    break;

            }

        }
    }




        public static void field () {
            System.out.println("ボール取りました。");
        }
        public void run () {
            System.out.println("進塁しました");
        }
        public int defense () {
            return 0;
        }
    }



