package game;

public class Playper {
    int  atk;  //攻撃力
    int def; //防御力




    public int pitch() {
        int ball = new java.util.Random().nextInt(3) + 1;


        switch (ball) {
            case 1:
                System.out.println("ボール投げました");
                break;
            case 2:
                System.out.println("デッドボール投げました");
                break;
            case 3:
                System.out.println("ストライク投げました");
        }
        return ball;





    }



    public void hit(Team team, int ball) {
        int balltype;

        if (ball == 1) {//ボール
            balltype = new java.util.Random().nextInt(2) + 1;
            switch (balltype) {
                case 1:
                    team.setOut(1);
                    System.out.println("ボール打ちました。" + team.getOut());

                    break;
                case 2:
                    team.setBase(1);
                    System.out.println("ボール打ってないです。out" +team.getBase());

                    break;
                default:
                    break;

            }
        } else if (ball == 2) {
            team.setBase(4);
            System.out.println("デットボールなので進塁しました。" +team.getBase());



        } else {
            balltype = new java.util.Random().nextInt(2) + 1;
            switch (balltype) {
                case 1:
                    team.setScore(1,1);
                    //System.out.println("打ちました。"+ team.getScore());



                    break;
                case 2:
                    team.setOut(1);
                    System.out.println("ストライク打ってないです。" +team.getOut());

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



