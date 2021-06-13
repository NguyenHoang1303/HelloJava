package lab2.bai2;

public class Battery {

    private int energy;

    public Battery(){};

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


    public void decreaseEnergy() {
        energy--;
    }
}
