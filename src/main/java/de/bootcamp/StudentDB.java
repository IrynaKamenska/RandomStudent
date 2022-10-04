package de.bootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    private final HashMap<Integer, Student> students;

    public StudentDB(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public HashMap<Integer, Student> getAllStudents() {
        return students;
    }

    public Student getRandomStudent() {
        int randomStudent = (int) (Math.random() * (students.size()));
        return students.get(randomStudent);
    }

//    public Student findById(int id){
//        for (Student student : students.values()) {
//            int studentId = student.getId();
//            if(id == studentId){
//                return student;
//            }
//        }
//        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
//    }

    public Student findById(int id) {
        for (Map.Entry<Integer, Student> set :
                students.entrySet()) {
            int studentId = set.getValue().getId();
            if (id == studentId) {
                System.out.println("Value " + set.getValue());
            }
            System.out.println("Key-value-pair" + set.getKey() + " " + set.getValue());
        }
        throw new RuntimeException("Student mit id: " + id + " wurde nicht gefunden");
    }

//    public Student findStudentById(int id) {
//        for (int i = 0; i < students.size(); i++) {
//            if (id == students.get(i).getId()) {
//                return students.get(i);
//            }
//        }
//        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
//    }


}
