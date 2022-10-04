package de.bootcamp;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student [] students){
        this.students = new Student[50];

    }
    public  Student[] getAllStudents(){
        return students;
    }

    public Student[] getRandomStudent() {
        int randomStudent = (int)(Math.random() * (students.length-1));
        return new Student[randomStudent];
    }

}
