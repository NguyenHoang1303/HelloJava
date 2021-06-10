package demo.luongnhanvien;

public class tinhluongthuong {

    int luong(float namKinhNghiem){
        int luong;
        if ( namKinhNghiem > 0 && namKinhNghiem < 1){
            luong = 1000000;
        } else if( namKinhNghiem >= 1 && namKinhNghiem <= 2){
            luong = 2000000;
        } else{
            luong = 3000000;
        }
        return luong;
    }

    public  double luongthuong(float kinhNghiem, float congHien ){
        int luong = luong(kinhNghiem);
        double thuong;
        if (congHien < 1 && congHien > 0){
            thuong = luong * 0.3;
        } else if ( congHien >= 1 && congHien < 2 ){
            thuong = luong * 0.5;
        } else if ( congHien >=2 && congHien < 5){
            thuong = luong;
        } else {
            thuong = luong * 2;
        }
        return  thuong;
    }

}
