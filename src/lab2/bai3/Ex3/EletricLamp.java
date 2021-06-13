package lab2.bai3.Ex3;

public class EletricLamp {
    private boolean status;
    public EletricLamp(){};
    public void turnOn(boolean statusBt){
        this.status = statusBt;
        if( this.status == true ){
            System.out.println("đèn sáng");
        }
    };
    public void turnOff(boolean statusBt){
        this.status = statusBt;
        if( this.status == false ){
            System.out.println("đèn đã tắt");
        }
    };

}
