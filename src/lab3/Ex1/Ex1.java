package lab3.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        String name[];
        int ages[];

        ages = new int[5];
        System.out.println(ages.length);
        System.out.println(ages[5]);
        System.out.println(ages[2]);
        ages[2] = 102;
        System.out.println(ages[2]);
    }
}
