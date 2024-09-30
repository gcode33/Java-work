package lab13.exercise1;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;



    public Car(){
        setmaxPassengers(0);
        setregistrationNumber("Nothing specified");
    }
    public Car(double pr, double len, double hgt, double wgt, String mft, String mod, int passnum, String reg) {
        super(pr, len, hgt, wgt, mft, mod);
        setmaxPassengers(passnum);
        setregistrationNumber(reg);
    }
    public void setmaxPassengers(int num) {
        maxPassengers=num;
    }

    public void setregistrationNumber(String reg) {
        registrationNumber=reg;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString(){
        return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration Number: " + getRegistrationNumber();
    }

}
