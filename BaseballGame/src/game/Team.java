package game;

public class Team {
    String name;
    int round;
    int[] scores = new int[9];
    int out;
    int base;

    public void setScore(int round, int score) {
        scores[round] += score;
    }
    public int[] getScores() {
        return scores;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setOut(int out) {
        this.out += out;
    }
    public int getOut() {
        return this.out;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getBase() {
        return this.base;
    }

}
