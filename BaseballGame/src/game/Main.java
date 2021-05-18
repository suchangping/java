package game;

public class Main {
    public static void main(String args[]) {
        Team teamA = new Team();
        Team teamB = new Team();
        Playper p = new Playper();
        teamA.setName("ソフトバンク");
        teamB.setName("楽天");

        for (int i = 0; i < 9; i++){
            System.out.println(i);

            int ball=p.pitch();
            p.hit(teamA,ball);
            if (i==3) {
                teamA.setOut(9);
            }
            System.out.println(teamA.getOut());
            if (teamA.getOut()==9) {
                return;
            }

        }
    }


}
