package Lab10;

public class bank {
    private String owner;

    private int num;

    private static double interest_rate;


    public bank(){this("Owner not available", 0, 0.0);}

    public bank(String owner, int num, double interest_rate){
        setOwner(owner);
        setNum(num);
        setRate(interest_rate);
    }

    public String getOwner(){return owner;}

    public int getNum(){return num;}

    public static double getInterest_rate(){return interest_rate;}

    public void setOwner(String owner){this.owner = owner;}

    public void setNum(int num){this.num = num;}

    public static void setRate(double interest_rate){bank.interest_rate = interest_rate;}


    public String toString() {
        return "Owner: " + getOwner() + "  Account Number: " + getNum() +
                "  Interest Rate: " + getInterest_rate();
    }

}
