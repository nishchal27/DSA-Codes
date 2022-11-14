package Oops;

import java.util.*;

class Student {
    int age;
    float marks;
    String name;
    int money;

void changeName(){
    this.name = "abhi";
}

    // constructor
    void students(int amount) {
        money = amount;
    }
}

public class ClassAndObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.changeName();
        System.out.println(s1.name + "name");
        s1.students(120);
        System.out.println(s1.money);
    }
}
