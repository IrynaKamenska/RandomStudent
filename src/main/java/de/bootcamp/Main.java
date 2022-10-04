package de.bootcamp;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ana", 1);
        Student st2 = new Student("Bob", 2);

//        Student [] arr = new Student[2];
//        arr[0] = st1;
//        arr[1] = st2;

        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1,st1);
        map.put(2,st2);
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        //System.out.println(st1);

        StudentDB db = new StudentDB(map);
        HashMap<Integer, Student> mapOfStudents = db.getAllStudents();

        System.out.println("Random student: " + db.getRandomStudent());
        System.out.println("List of students: " + mapOfStudents);
        try{
            db.findById(1);
        } catch(RuntimeException e){
            System.out.println("id wurde nicht gefunden");
        }
        System.out.println(db.findById(1));


    }
}