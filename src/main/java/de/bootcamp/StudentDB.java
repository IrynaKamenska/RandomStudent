package de.bootcamp;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student [] students){
        this.students = new Student[]{};
    }
    public  Student[] getAllStudents(){
        return students;
    }

    public Student getRandomStudent() {
        int randomStudent = (int)(Math.random() * (students.length));
        return students[randomStudent];
    }

    public Student findById(int id){
        for (Student student : students) {
            int studentId = student.getId();
            if(id == studentId){
                return student;
            }
        }
        throw new RuntimeException("Student mit id: " + id + "wurde nicht gefunden");
    }


}
