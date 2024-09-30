package ProblemSolving11.exercisea;

import java.util.Arrays;

public class Soccer extends BallSport{
    private int gameDuration;
    private String[] surfaces;
    private String[] rules;
    private int PlayersPerTeam;

    public Soccer(String name, int yearEstablished, int gameDuration, String[] surfaces, String[] rules, int playersPerTeam) {
        super(name, yearEstablished);
        setGameDuration(gameDuration);
        setSurfaces(surfaces);
        setRules(rules);
        setPlayersPerTeam(playersPerTeam);
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public String[] getSurfaces() {
        return surfaces;
    }

    public String[] getRules() {
        return rules;
    }

    public int getPlayersPerTeam() {
        return PlayersPerTeam;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public void setSurfaces(String[] surfaces) {
        this.surfaces = surfaces;
    }

    public void setRules(String[] rules) {
        this.rules = rules;
    }

    public void setPlayersPerTeam(int playersPerTeam) {
        PlayersPerTeam = playersPerTeam;
    }

    @Override
    public String toString() {
        String output = "";
        output = super.toString()+ "\nGame duration: " +getGameDuration()+
                "\n" +
                "Surfaces for Game: ";
        for(String surface: getSurfaces()){
            output += surface+ " ";
        }
        output+= "\n Rules for the game are";
        for(String rules: getRules()){
            output += "\n"+rules+ " ";
        }
        output+= "\n players per team"+ getPlayersPerTeam();
        return output;
    }
}
