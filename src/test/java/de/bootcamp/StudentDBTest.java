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
}