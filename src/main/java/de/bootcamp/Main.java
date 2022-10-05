package de.bootcamp;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Student st1 = new ComputerScienceStudent("Ana", 1, "Informatik");
        Student st2 = new ComputerScienceStudent("Bob", 2, "Matte");
        System.out.println(st1.getSubject());
        System.out.println(st2.getSubject());

        System.out.println("Subject :" + st1.getSubject());

        Student st3 = new BiologyStudent("Tom", 3, "Botanik");
        Student st4 = new BiologyStudent("John", 4, "Zoologie");
        System.out.println(st3.getSubject());
        System.out.println(st3.getSubject());

        System.out.println("Adress:" + st3.getAdress());
        System.out.println("IdentityCardNumber:" + st3.getIdentityCardNumber());

        HashMap<Integer, Student> map = new HashMap<>();
        map.put(0, st1);
        map.put(1, st2);
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        StudentDB db = new StudentDB(map);
        System.out.println("To string student: " + db.toStringStudent());
        System.out.println("To string StudentDB: " + db.toStringStudentDB());

        HashMap<Integer, Student> mapOfStudents = db.getAllStudents();
        System.out.println("Map of students: " + mapOfStudents);
        System.out.println("Random student: " + db.getRandomStudent());

        try {
            Student st = db.findById(1);
            System.out.println("Student was found: " + st);
        } catch (RuntimeException e) {
            System.out.println("Student was not found");
        }

        System.out.println("All students: \n" + db);





    }





}