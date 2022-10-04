package de.bootcamp;

import org.junit.jupiter.api.Test;

import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void getAllStudents() {
        //given
        Student student1 = new Student("Zeshan", 1);
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1, student1);

        StudentDB db = new StudentDB(map);

        //when
        HashMap<Integer, Student> actual = db.getAllStudents();
        HashMap<Integer, Student> expected = new HashMap<>();
        expected.put(1, student1);

        //then
        assertEquals(expected, actual);
    }


    @Test
    public void getAllStudentsString() {
        //given
        Student student1 = new Student("Zeshan", 1);
        Student student2 = new Student("Ana", 2);
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);

        StudentDB db = new StudentDB(map);

        //when
        HashMap<Integer, Student> actual = db.getAllStudents();
        HashMap<Integer, Student> expected = new HashMap<>(map);
        System.out.println(expected);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        //given
        Student student1 = new Student("Zeshan", 0);
        Student student2 = new Student("Ana", 1);

        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);

        StudentDB db = new StudentDB(map);


        // when
        Student actual = db.findById(0);
        Student expected = map.get(1);
        System.out.println(expected);
        System.out.println("Actual " + actual);

        // then
        assertEquals(expected, actual);

    }

    @Test
    public void findByIdWithTryCatch() {
        //given
        Student student1 = new Student("Zeshan", 0);
        Student student2 = new Student("Ana", 1);

        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);

        StudentDB db = new StudentDB(map);


        // when
        try{
            db.findById(2);
            fail("Exception ist nicht aufgetreten");

        } catch(Exception e){
            System.out.println("Exception ist aufgetreten");
        }
        }

}