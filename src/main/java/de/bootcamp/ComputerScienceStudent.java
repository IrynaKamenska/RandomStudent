package de.bootcamp;

public class ComputerScienceStudent extends Student {
    private String studienfach;


    public ComputerScienceStudent(String name, int id, String studienfach) {
        super(name, id);
        this.studienfach = studienfach;
    }

    public String getSubject() {
        return studienfach;
    }

    public void setStudienfach(String studienfach) {
        this.studienfach = studienfach;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "studienfach='" + studienfach + '\'' +
                "} " + super.toString();
    }


    public String toString1() {
        return "ComputerScienceStudent{" +
                "studienfach='" + studienfach + '\'' +
                "studienfach='" + getName() + '\'' +
                '}';
    }


    @Override
    public String getCourse() {
        return "Computer science";
    }
}
