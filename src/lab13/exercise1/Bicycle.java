package lab13.exercise1;

public class Bicycle extends  Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
       setgearCount(0);
       sethasBell(false);
    }
    public Bicycle(double pr, double len, double hgt, double wgt, String mfc, String mod, int gearCount, boolean hasBell){
        super(pr, len, hgt, wgt, mfc, mod);
    }


    public void setgearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public int getGearCount() {

        return gearCount;
    }

    public void sethasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public boolean getHasBell() {
        return hasBell;
    }
    public String toString() {
        String str = super.toString() + "\nHas bell: ";

        if(getHasBell())
            str+="Yes";
        else
            str+="No";

        str+="\nGear Count: " + getGearCount();

        return str;
    }
}
