package de.bootcamp;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student [] students){
        this.students = students;

    }
    public  Student[] getAllStudents(){
        return students;
    }

}
