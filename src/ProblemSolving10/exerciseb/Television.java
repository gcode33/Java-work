package ProblemSolving10.exerciseb;
public class Television extends ElectronicDevice {
    private int numberOfChannels;
    private String screenType;

    public Television(String screenType, int numberOfChannels, Dimension dimension, int partNumber, String partName, double prc){
        super(partName, partNumber, dimension, prc);
        setScreenType(screenType);
        setNumberOfChannels(numberOfChannels);
    }

    public void setNumberOfChannels(int numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getNumberOfChannels() {
        return numberOfChannels;
    }

    public String getScreenType() {
        return screenType;
    }
    @Override
    public String getCategory() {
        return "Television";
    }
    public String toString() {
        return String.format("%-20s%s\n%-20s%s\n%-20s%d\n%-20s%s\n%-20s%.2f\n%-20s%d\n%-20s%s","Category: ", getCategory(),"Part Name:",partName,
                "Part Number: ",partNumber,"Dimensions: ",dimension,"Price: ",prc,"Number of Channels:",
                getNumberOfChannels(),"Screen Type: ",getScreenType());
    }
}
