package de.bootcamp;

public class ComputerScienceStudent extends Student implements Citizen {
    private String subject;


    public ComputerScienceStudent(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "studienfach='" + subject + '\'' +
                "} " + super.toString();
    }


    public String toString1() {
        return "ComputerScienceStudent{" +
                "studienfach='" + subject + '\'' +
                "studienfach='" + getName() + '\'' +
                '}';
    }


    @Override
    public String getAdress() {
        return "computer science adress";
    }

    @Override
    public int getIdentityCardNumber() {
        return 100;
    }
}
