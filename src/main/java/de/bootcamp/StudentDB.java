package de.bootcamp;


import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    private final HashMap<Integer, Student> students;

    public StudentDB(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public HashMap<Integer, Student> getAllStudents() {
        return students;
    }

    public Student getRandomStudent() {
        int randomStudent = (int) (Math.random() * (students.size()));
        return students.get(randomStudent);
    }


    public Student findById(int id) {
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            int studentId = entry.getValue().getId();
            if (id == studentId) {
                return entry.getValue();
            }
        }
        throw new RuntimeException("Student mit id: " + id + " wurde nicht gefunden");
    }

    public String toStringStudent() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students.values()) {
            sb.append(student.toString() + "\n");
        }
        return sb.toString();
    }


    public String toStringStudentDB() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

//    public Student findStudentById(int id) {
//        for (int i = 0; i < students.size(); i++) {
//            if (id == students.get(i).getId()) {
//                return students.get(i);
//            }
//        }
//        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
//    }

    //    public Student findById(int id){
//        for (Student student : students.values()) {
//            int studentId = student.getId();
//            if(id == studentId){
//                return student;
//            }
//        }
//        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
//    }
}
