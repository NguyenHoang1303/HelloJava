package lab3.Ex2;

public class StringEx2 {
    public static void main(String[] args) {
        String name ;
//        name;
        name = "learn Java By Example";
        System.out.println(name.length());
        System.out.println(name.equals("learn"));
        System.out.println(name.equals("learn Java By Example"));
        System.out.println(name.equals("learn Java BY EXAMPLE"));
        System.out.println(name.split(""));
    }
}
