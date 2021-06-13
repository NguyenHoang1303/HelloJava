package lab2.bai1;


public class Client {
    public static void main(String[] args) {
        Student studentA = new Student( 1, "Nguyen Van A", true );
        Student studentB = new Student( 2, "Pham Thi B", false );

        studentA.printInfor();
        studentB.printInfor();

        studentB.setName("Hoang Si Nguyen");
        studentB.printInfor();
    }
}
