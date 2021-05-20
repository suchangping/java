package game;

public class Main {
    public static boolean isAattack = true;
    public static void main(String args[]) {
        Team teamA = new Team();
        Team teamB = new Team();
        teamA.setName("ソフトバンク");
        teamB.setName("楽天");

        System.out.println("---野球ゲームプログラム開始---");
        int roundcnt=9;

        for (int round = 0; round < roundcnt; round++) {
            System.out.println("★★★★第" + (round + 1) + "回合★★★★");
            if (round>=9 && teamA.getSumScore()==teamB.getSumScore()) {
                roundcnt+=1 ;
            }

            for(int ch = 0; ch <2; ch++) {
                Player p = new Player();
                if (ch == 0) {
                    System.out.println("★★★★第" + (round + 1) + "回の上回合★★★★");
                    System.out.println("攻撃チーム:" + teamA.name
                            + "\n防御チーム:" + teamB.name);
                    p.playstart(teamA, round);

                }else {
                    System.out.println("★★★★第" + (round + 1) + "回の下回合★★★★");
                    System.out.println("攻撃チーム:" + teamB.name
                            + "\n防御チーム:" + teamA.name);
                    p.playstart(teamB, round);
                }

            }

        }
        String result = (teamA.getSumScore() > teamB.getSumScore())
                ? teamA.name:teamB.name;
        System.out.println("\n---野球ゲームプログラム終了---");
        System.out.println("\n ★★★★★★★★★★★★★★★★★★★★");
        System.out.println(result + "チームが勝利！　おめでとうございます!");
        System.out.println(teamA.name + " :  "+teamB.name +"   " + teamA.getSumScore() +"  :  "+ teamB.getSumScore());
       // System.out.println(teamB.name + "の総得点：" + teamB.getSumScore());
    }
}
