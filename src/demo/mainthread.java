package demo;

import demo.minvamax.xuLiMinMax;
import demo.tamgiac.tamgiac;
import demo.luongnhanvien.tinhluongthuong;

import java.util.Scanner;

public class mainthread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
       Viết chương trình cho phép tính mức lương thưởng tháng 13 của một nhân viên.
    - Mức lương chính thức của nhân viên được trả dựa theo số năm kinh nghiệm, trung bình như sau
        - Dưới 2 năm: 10 triệu.
        - Từ 2 đến 5 năm: 20 triệu.
        - Trên 5 năm: 30 triệu.
    - Mức thưởng tháng thứ 13 phụ thuộc vào lương chính thức và số năm cống hiến cho công ty theo tỉ lệ.
        - Cống hiến dưới 1 năm: thưởng 30% lương chính thức.
        - Cống hiến từ 1 năm đến 2 năm: thưởng 50%.
        - Cống hiến từ 2 năm đến 5 năm: thưởng 100%.
        - Cống hiến từ 5 năm trở lên: thưởng 200%.
    - Hàm tính lương tháng 13 được viết với hai tham số đầu vào là số năm kinh nghiệm và số năm cống hiến.
       * */

            demo.luongnhanvien.tinhluongthuong luongthuong = new tinhluongthuong();
            float kingNghiem;
            float congHien;
            System.out.println("Vui long nhap so nam kinh nghiem:");
            kingNghiem = scanner.nextFloat();
            System.out.println("Vui long nhap so nam cong hien:");
            congHien = scanner.nextFloat();
            double ketqua = luongthuong.luongthuong(kingNghiem,congHien);
            System.out.printf("luong than thu 13 cua ban la: %.2f", ketqua);




         /*Viết chương trình tính nửa chu vi tam giác.
    Yêu cầu người dùng nhập vào 3 cạnh của tam giác.
    Trong trường hợp số đo 1 cạnh bất kỳ nhỏ hơn hoặc bằng 0 thì thông báo lỗi : “Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0” và dừng chương trình.
    Trong trường hợp tổng hai cạnh nhỏ hơn hoặc bằng cạnh còn lại thông báo lỗi: “Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)” và dừng chương trình.
    Trường hợp còn lại tính và in ra nửa chu vi tam giác.
    Hàm tính nửa chu vi phải được viết riêng.
    * */
            demo.tamgiac.tamgiac tamgiac1 = new tamgiac();
            System.out.println("vui long nhap cac canh cua tam giac:");
            System.out.printf("a:");
            float a = scanner.nextFloat();
            System.out.printf("c:");
            float b = scanner.nextFloat();
            System.out.printf("b:");
            float c = scanner.nextFloat();
            tamgiac1.xuLiCacCanh(a, b, c);



//         tim so lon nhat va nho nhat trong mang
            demo.minvamax.xuLiMinMax chuoi = new xuLiMinMax();
            System.out.println("nhap so luong phan tu ban muon nhap: ");
            int n = scanner.nextInt();
            int[] arrs = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("nhap phan tu thu %d: ", i + 1);
                arrs[i] = scanner.nextInt();
            }

            System.out.printf("so lon nhat trong mang la: %d", chuoi.max(arrs));
            System.out.printf("\nso lon nho trong mang la: %d", chuoi.min(arrs));

    }

}
