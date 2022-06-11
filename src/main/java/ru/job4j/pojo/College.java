package ru.job4j.pojo;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("a b c");
        student.setGroup("123");
        student.setCreated(new Date());
        System.out.println(student.toString());
    }
}

