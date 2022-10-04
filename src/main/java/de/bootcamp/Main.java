package de.bootcamp;

import de.bootcamp.Student;
import de.bootcamp.StudentDB;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ana", 1);
        st1.setName("Bob");
        System.out.println(st1);
        System.out.println(st1.getName());

    }
}