package de.bootcamp;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ana", 1);
        Student st2 = new Student("Bob", 2);

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


        ComputerScienceStudent compStudent = new ComputerScienceStudent("Alice", 1, "Informatik");
        compStudent.setStudienfach("Matte");
        System.out.println("Computer science student: " + compStudent.toString());
        System.out.println(compStudent.getStudienfach());
        System.out.println(compStudent.getName());


    }





}