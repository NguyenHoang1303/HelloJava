package lab2.bai3.Ex3;

public class LamphHandl {
    public static void main(String[] args) {
        SwitchButton switchButton1 = new SwitchButton();
        EletricLamp eletricLamp1 = new EletricLamp();
        int number = 0;
        do {
            switchButton1.switchOn(true, eletricLamp1);
            switchButton1.switchOff(false, eletricLamp1);
            number++;
        }while (number < 10);




    }
}
