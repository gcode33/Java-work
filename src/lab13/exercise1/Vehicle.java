package lab13.exercise1;

public class Vehicle {
    private double pr;
    private double len;
    private double hgt;
    private double wgt;
    private String mfc;
    private  String mod;

    public Vehicle() {
        this(0,0,0,0,"No manufacturer specified","No model specified");
    }
    public Vehicle(double pr, double len, double hgt, double wgt, String mfc, String mod){
        setprice(pr);
        setlength(len);
        setheight(hgt);
        setweight(wgt);
        setmanufacturer(mfc);
        setmodel(mod);
    }

    public void setprice(double pr) {
        this.pr = pr;
    }

    public double getPr() {
        return pr;
    }

    public void setheight(double hgt) {
        this.hgt = hgt;
    }

    public double getHgt() {
        return hgt;
    }

    public void setlength(double len) {
        this.len = len;
    }

    public double getLen() {
        return len;
    }

    public void setmanufacturer(String mfc) {
        this.mfc = mfc;
    }

    public String getMfc() {
        return mfc;
    }

    public void setmodel(String mod) {
        this.mod = mod;
    }

    public String getMod() {
        return mod;
    }

    public void setweight(double wgt) {
        this.wgt = wgt;
    }

    public double getWgt() {
        return wgt;
    }
    public String toString() {
        return "\nPrice: " + getPr() + "\nLength: " + getLen() +
                "\nHeight: " + getHgt() + "\nWeight: " + getWgt() +
                "\nManufacturer: " + getMfc() + "\nModel: " + getMod();
    }

}
