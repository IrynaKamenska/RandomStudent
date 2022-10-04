package de.bootcamp;

import java.rmi.server.ExportException;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student [] students){
        this.students = students;
    }
    public  Student[] getAllStudents(){
        return students;
    }

    public Student getRandomStudent() {
        int randomStudent = (int)(Math.random() * (students.length));
        return students[randomStudent];
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

    public Student findStudentById(int id) throws Exception {
        for (int i = 0; i < students.length ; i++) {
            if(id == students[i].getId()){
                return students[i];
            }
        }
        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
    }


}
