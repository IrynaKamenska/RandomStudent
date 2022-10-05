package de.bootcamp;

import org.junit.jupiter.api.Test;

import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void getAllStudents() {
        //given
//        Student student1 = new Student("Zeshan", 1);
        Student student1 = new ComputerScienceStudent("Alice", 1, "Informatik");
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(0, student1);

        StudentDB db = new StudentDB(map);

        //when
        HashMap<Integer, Student> actual = db.getAllStudents();
        HashMap<Integer, Student> expected = new HashMap<>();
        expected.put(0, student1);

        //then
        assertEquals(expected, actual);
    }


    @Test
    public void getAllStudentsString() {
        //given
//        Student student1 = new Student("Ana", 1);
//        Student student2 = new Student("Bob", 2);
        Student student1 = new ComputerScienceStudent("Ana", 1, "Informatik");
        Student student2 = new ComputerScienceStudent("Bob", 2, "Matte");
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(0, student1);
        map.put(1, student2);

        StudentDB db = new StudentDB(map);

        //when
        String actual = db.toStringStudent();
        String expected = """
                ComputerScienceStudent{studienfach='Informatik'} Student{name='Ana', id=1}
                ComputerScienceStudent{studienfach='Matte'} Student{name='Bob', id=2}
                """;


        //then
        assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        //given
//        Student student1 = new Student("Zeshan", 1);
//        Student student2 = new Student("Ana", 2);

        Student student1 = new ComputerScienceStudent("Alice", 1, "Informatik");
        Student student2 = new ComputerScienceStudent("Bob", 2, "Matte");
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(0, student1);
        map.put(1, student2);

        StudentDB db = new StudentDB(map);

        // when
        Student actual = db.findById(2);

        // then
        assertEquals(student2, actual);
    }

    @Test
    public void findByIdWithTryCatch() {
        //given
//        Student student1 = new Student("Zeshan", 1);
//        Student student2 = new Student("Ana", 2);
        Student student1 = new ComputerScienceStudent("Alice", 1, "Informatik");
        Student student2 = new ComputerScienceStudent("Bob", 2, "Matte");

        HashMap<Integer, Student> map = new HashMap<>();
        map.put(0, student1);
        map.put(1, student2);

        StudentDB db = new StudentDB(map);

        // when
        try {
            db.findById(9);
            fail("Exception ist nicht aufgetreten");
        } catch (Exception e) {
            System.out.println("Exception ist aufgetreten");
        }
    }

    @Override
    public String toString() {
        return "StudentDBTest{}";
    }
}