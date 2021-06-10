package demo.tamgiac;

public class tamgiac {
    public void xuLiCacCanh(float a, float b, float c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
            System.exit(0);
        } else if ((a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại");
            System.exit(0);
        } else {
            System.out.printf("mot nua chu vi tam giac la: %.2f", chuVi(a, b, c));
        }

    }

    float chuVi(float a, float b, float c) {
        return (a + b + c) / 2;
    }
}
