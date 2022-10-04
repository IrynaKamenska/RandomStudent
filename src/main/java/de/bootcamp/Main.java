package de.bootcamp;

import de.bootcamp.Student;
import de.bootcamp.StudentDB;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ana", 1);
        Student st2 = new Student("Bob", 2);

        Student [] arr = new Student[2];
        arr[0] = st1;
        arr[1] = st2;

        System.out.println(st1);

        StudentDB db = new StudentDB(arr);
        System.out.println(db);

        db.getAllStudents();
        try{
            db.findById(1);
        } catch(RuntimeException e){
            System.out.println("id wurde nicht gefunden");
        }


    }
}