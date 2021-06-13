package lab2.bai1;

public class Student {
    private int id;
    private String name;
    private boolean gender;

    public Student(){};
    public Student(int id,String name,boolean gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return gender;
    }

    public void setMale(boolean gender) {
        this.gender = gender;
    }

    public void printInfor(){
        System.out.printf("\nid: %d, name: %s, gender: %b", this.id, name, gender);
    }

}
