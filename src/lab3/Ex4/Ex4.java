package lab3.Ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;
        Scanner keBoard = new Scanner(System.in);
        System.out.println("student name");
        name = keBoard.nextLine();
        System.out.println("student age");
        age = keBoard.nextInt();
        System.out.println("student weught");
        weight = keBoard.nextFloat();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
    }
}
