package de.bootcamp;

public class ComputerScienceStudent extends Student {
    private String studienfach;


    public ComputerScienceStudent(String name, int id, String studienfach) {
        super(name, id);
        this.studienfach = studienfach;
    }

    public String getStudienfach() {
        return studienfach;
    }

    public void setStudienfach(String studienfach) {
        this.studienfach = studienfach;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "name='" + getName() + '\'' +
                "id='" + getId() + '\'' +
                "studienfach='" + studienfach + '\'' +
                '}';
    }

}
