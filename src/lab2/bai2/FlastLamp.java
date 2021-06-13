package lab2.bai2;

public class FlastLamp {
    private boolean status;
    private Battery battery;

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public FlastLamp() {
        status = true;
    }

    public void light() {
        if (status == true && battery != null && battery.getEnergy() > 0) {
            battery.decreaseEnergy();
        }
        ;
    }

    public void turnOn() {
        if (battery != null && battery.getEnergy() > 0) {
            status = true;
        }
        light();
    }

    public void turnOff() {
        status = false;
    }

}
