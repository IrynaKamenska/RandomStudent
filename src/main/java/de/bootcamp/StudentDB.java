package de.bootcamp;

import java.util.ArrayList;

public class StudentDB {
    private final ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students){
        this.students = students;
    }
    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public Student getRandomStudent() {
        int randomStudent = (int)(Math.random() * (students.size()));
        return students.get(randomStudent);
    }

    public Student findById(int id){
        for (Student student : students) {
            int studentId = student.getId();
            if(id == studentId){
                return student;
            }
        }
        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
    }

    public Student findStudentById(int id){
        for (int i = 0; i < students.size() ; i++) {
            if(id == students.get(i).getId()){
                return students.get(i);
            }
        }
        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
    }


}
