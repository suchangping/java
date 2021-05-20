package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    public void testScores() {
        Team teamA = new Team();
        teamA.setName("ソフトバンク");
        Team teamB = new Team();
        teamB.setName("楽天");

        teamA.scores = new int[]{1, 2, 0, 1, 0, 0, 0, 0};
        teamB.scores = new int[]{1, 2, 0, 1, 0, 0, 0, 6};
        assertEquals(4, teamA.getSumScore());

    }
    @Test
    public void testRuner() {

    }
}
