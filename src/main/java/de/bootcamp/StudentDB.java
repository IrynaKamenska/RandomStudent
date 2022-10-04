package de.bootcamp;

import java.util.ArrayList;

public class StudentDB {

    private ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students){
        this.students = students;

    }
    public  ArrayList<Student> getAllStudents(){
        return students;
    }
public  Student findById(int id) throws Exception {

    for (int i = 0; i < students.size(); i++) {
        if (id == students.get(i).getId()) {
            return students.get(i);
        }

    }
    throw new Exception("Index not found");
}


}
