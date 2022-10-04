package de.bootcamp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ana", 1);
        Student st2 = new Student("Bob", 2);

//        Student [] arr = new Student[2];
//        arr[0] = st1;
//        arr[1] = st2;

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);


        System.out.println(st1);

        StudentDB db = new StudentDB(list);
        ArrayList<Student> listOfStudents = db.getAllStudents();
        System.out.println("List od students: " + listOfStudents);
        try{
            db.findById(1);
        } catch(RuntimeException e){
            System.out.println("id wurde nicht gefunden");
        }


    }
}