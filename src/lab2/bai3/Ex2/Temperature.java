package lab2.bai3.Ex2;

public class Temperature {
    private double cTemp;

    public Temperature(){};

    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    };

    public double getcTemp() {
        return cTemp;
    };

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    };

    public double getFTemp(double cTemp){
        return (cTemp * 1.8) + 32;
    };

    public double getKTemp(double cTemp){
        return ( cTemp + 273.15);
    }

}
