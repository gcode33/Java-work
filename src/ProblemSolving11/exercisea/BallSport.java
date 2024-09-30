package ProblemSolving11.exercisea;

public abstract class BallSport {
    private String name;
    private int yearEstablished;


    public BallSport(String name, int yearEstablished){
        setName(name);
        setYearEstablished(yearEstablished);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BallSport{" +
                "name='" + getName() + '\'' +
                ", yearEstablished=" + getYearEstablished() +
                '}';
    }
}
