package de.bootcamp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void getAllStudents(){
        //given
        Student student1 = new Student("Zeshan",1);
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);

        StudentDB db = new StudentDB(list);

        //when
        ArrayList<Student> actual = db.getAllStudents();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);

        //then
        assertEquals(expected,actual);
    }


    @Test
    public void getAllStudentsString(){
        //given
        Student student1 = new Student("Zeshan",1);
        Student student2 = new Student("Ana",2);
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        StudentDB db = new StudentDB(list);

        //when
        ArrayList<Student> actual = db.getAllStudents();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        //then
        assertEquals(expected,actual);
    }

    @Test
    public void findById() {
        //given
        Student student1 = new Student("Zeshan",0);
        Student student2 = new Student("Ana",1);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        StudentDB db = new StudentDB(list);


       // when
       Student actual = db.findById(1);
       Student expected = list.get(1);

       // then

        assertEquals(expected, actual);

    }

    @Test
    public void findByIdWithTryCatch() {
        //given
        Student student1 = new Student("Zeshan",0);
        Student student2 = new Student("Ana",1);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        StudentDB db = new StudentDB(list);


        // when
        try{
            db.findStudentById(2);
            fail("Exception ist nicht aufgetreten");

        } catch(Exception e){
            System.out.println("Exception ist aufgetreten");
        }


    }



}