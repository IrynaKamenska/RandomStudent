package de.bootcamp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void getAllStudents(){
        //given
        Student student1 = new Student("Zeshan",1);
        Student [] array1 = new Student[1];
        array1[0] = student1;
        StudentDB db = new StudentDB(array1);

        //when
        Student[] actual = db.getAllStudents();
        Student[] expected = new Student[]{student1};
        //then
        assertArrayEquals(expected,actual);
    }


    @Test
    public void getAllStudentsString(){
        //given
        Student student1 = new Student("Zeshan",1);
        Student student2 = new Student("Ana",2);
        Student [] array1 = new Student[2];
        array1[0] = student1;
        array1[1] = student2;
        StudentDB db = new StudentDB(array1);

        //when
        Student[] actual = db.getAllStudents();
        Student[] expected = new Student[]{student1, student2};
        //then
        assertArrayEquals(expected,actual);
    }

    @Test
    public void findById() throws Exception {
        //given
        Student student1 = new Student("Zeshan",0);
        Student student2 = new Student("Ana",1);
        Student [] array1 = new Student[2];
        array1[0] = student1;
        array1[1] = student2;

        StudentDB db = new StudentDB(array1);

//
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }


       // when
       Student actual = db.findStudentById(1);
       Student expected = (array1[1]);

       // then

        assertEquals(expected, actual);

    }

    @Test
    public void findByIdWithTryCatch() throws Exception {
        //given
        Student student1 = new Student("Zeshan",0);
        Student student2 = new Student("Ana",1);
        Student [] array1 = new Student[2];
        array1[0] = student1;
        array1[1] = student2;

        StudentDB db = new StudentDB(array1);


        // when
        try{
            db.findStudentById(2);
            fail("Exception ist nicht aufgetreten");

        } catch(Exception e){
            System.out.println("Exception ist aufgetreten");
        }


    }



}