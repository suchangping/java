package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    public void testScoresSum() {
        Team teamA = new Team();
        Team teamB = new Team();
        teamA.scores = new int[]{1, 2, 0, 1, 0, 0, 0, 0, 1, 2};
        teamB.scores = new int[]{1, 2, 0, 1, 0, 0, 0, 6, 1, 2};
        assertEquals(7, teamA.getSumScore());
        assertEquals(13, teamB.getSumScore());
    }

    @Test
    public void testStrikeBall() {
        Team team = new Team();
        Player player = new Player();

        player.strikeBall(team,1,1);
        assertEquals(1, team.getSumScore());

        player.strikeBall(team,1,2);
        assertEquals(1, player.basecnt);

        player.strikeBall(team,1,5);
        assertEquals((player.basecnt + 1), player.outcnt);

        player.strikeBall(team,1,6);
        assertEquals(2, player.ballchance);
    }

    @Test
    public void testaddBase() {
        Team team = new Team();
        team.setName("ソフトバンク");
        Player p = new Player();
        p.addBase(team, 1);
        assertEquals(1, p.basecnt);
    }

    @Test
    public void testdelchang() {
        Team team = new Team();
        team.setName("ソフトバンク");
        Player p = new Player();
        p.delChance();
        assertEquals(2, p.ballchance);
    }
}
