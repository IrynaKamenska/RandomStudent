package de.bootcamp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void getAllStudents(){
        //given
        Student student1 = new Student("Zeshan",1);
        ArrayList<Student> students  = new ArrayList<>();
        students.add(student1);
        StudentDB db = new StudentDB(students);

        //when
        ArrayList<Student> actual = db.getAllStudents();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);

        //then
        assertArrayEquals(expected.toArray(),actual.toArray());
    }


    @Test
    public void getAllStudentsString(){
        //given
        Student student1 = new Student("Zeshan",1);
        Student student2 = new Student("Ana",2);
        ;
        ArrayList<Student> students  = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        StudentDB db = new StudentDB(students);

        //when
        ArrayList<Student> actual = db.getAllStudents();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        //then
        assertArrayEquals(expected.toArray(),actual.toArray());
    }
    @Test
    public void getStudentById() throws Exception {
        //given
        Student student1 = new Student("Zeshan",1);
        Student student2 = new Student("Ana",2);
        ArrayList<Student> students  = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        StudentDB db = new StudentDB(students);


        //when
        Student actual = db.findById(2);
        Student expected = students.get(1);
        //then
        assertEquals(expected,actual);
    }


}