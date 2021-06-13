package lab2.bai3.Ex3;

public class SwitchButton {
    private boolean status;
    private EletricLamp lamp;

    public SwitchButton() {
    }



    public void connectToLamp(boolean statusBt, EletricLamp lamp) {
        this.lamp = lamp;
        if (statusBt == true){
            lamp.turnOn(statusBt);
        } else {
            lamp.turnOff(statusBt);
        }

    }

    public void switchOff(boolean status,EletricLamp lamp){
        this.status = status;
        this.lamp = lamp;
        if ( this.status == false){
            connectToLamp(this.status,this.lamp);
        }
    };
    public void switchOn(boolean status, EletricLamp lamp){
        this.status = status;
        this.lamp = lamp;
        if ( this.status == true){
            connectToLamp(this.status,this.lamp);
        }
    };
}
