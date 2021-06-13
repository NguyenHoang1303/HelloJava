package lab2.bai3.Ex2;

public class CTemp {
    public static void main(String[] args) {
        Temperature temperature1 = new Temperature(25);
        double cTemp = temperature1.getcTemp();
//        System.out.println(cTemp);
        double kTemp = temperature1.getKTemp(cTemp);
        double fTemp = temperature1.getFTemp(cTemp);

        System.out.printf("%.2f độ C bằng %.2f độ K", cTemp, kTemp);
        System.out.printf("\n%.2f độ C bằng %.2f độ F", cTemp, fTemp);

    }
}
