package ProblemSolving11.exercisea;

public interface Game {
    public abstract void setRules(String[] rules);
    public abstract void setPlayersPerTeam(int playersPerTeam);
    public abstract  String[] getRules();
    public abstract int getPlayersPerTeam();
}
