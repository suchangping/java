package game;

public class Playper {

    public boolean pitch() {
        int ball = new java.util.Random().nextInt(2);
        boolean isbadball = (ball == 1) ? true:false;
        return isbadball;
    }
    public int batter(Team team, int round, boolean isbadball) {
        int balltype;
        if(isbadball) {//悪いボール
            balltype = new java.util.Random().nextInt(2) + 1;
            switch (balltype) {
                case 1:
                    team.setScore(round, 1);
                    break;
                case 2:
                    break;
                default:
                    break;

            }
        }else {
            balltype = new java.util.Random().nextInt(1);
            switch (balltype) {
                case 1:
                    break;
                default:
                    break;
            }
        }
        return 0;
    }
    public void runner() {

    }
    public int defense() {
        return 0;
    }
}
