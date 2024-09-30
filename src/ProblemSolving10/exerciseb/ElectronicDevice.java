package ProblemSolving10.exerciseb;

import java.util.Arrays;

public abstract class ElectronicDevice {
    protected String partName;
    protected int partNumber;
    protected Dimension dimension;
    protected double prc;


public ElectronicDevice(String partName, int partNumber, Dimension dimension, double prc){
    setDimensions(dimension);
    setPartNumber(partNumber);
    setPartName(partName);
    setPrice(prc);
}

    public void setDimensions(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public void setPrice(double prc) {
        this.prc = prc;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public double getPrc() {
        return prc;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getPartName() {
        return partName;
    }
    @Override
    public String toString() {
        return "part name: " + getPartName() + "  part number: " + getPartNumber() + "  Dimension: " +
                getDimension() + "  price " + getPrc();
    }
public abstract String getCategory();
}
