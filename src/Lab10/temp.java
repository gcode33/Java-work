package Lab10;

public class temp {
    public int OG_temp;

    private int max_temp;

    private int min_temp;


    public temp(int i) {
        setTemp(0);
        setMaxTemp(Integer.MAX_VALUE);
        setMinTemp(Integer.MIN_VALUE);
    }
    public temp(int OG_temp,int max_temp,int min_temp) {
        setTemp(OG_temp);
        setMaxTemp(max_temp);
        setMinTemp(min_temp);

    }

    public int getTemp(){return OG_temp;}
    private int getMaxTemp(){return max_temp;}
    private int getMinTemp(){return  min_temp;}


    public void setTemp(int Temp) {
        this.OG_temp = Temp;
        updateMaxMinTemp();
    }


    private void setMaxTemp(int max_temp){this.max_temp = max_temp;}

    private void setMinTemp(int min_temp){this.min_temp = min_temp;}
    private void updateMaxMinTemp() {
        if (OG_temp > max_temp)
            setTemp(max_temp);

        if (OG_temp < min_temp)
            setTemp(min_temp);
    }


    public String toString() {
        return  "temperature: " + getTemp() + "   max temperature : " + getMaxTemp() + "   min temperature: " + getMinTemp();
    }



}
