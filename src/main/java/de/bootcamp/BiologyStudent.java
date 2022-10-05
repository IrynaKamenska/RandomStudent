package de.bootcamp;

public class BiologyStudent extends Student implements Citizen{
    private String subject;


    public BiologyStudent(String name, int id, String subject) {
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
        return "BiologyStudent{" +
                "studienfach='" + subject + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getAdress() {
        return "Biology Adress";
    }

    @Override
    public int getIdentityCardNumber() {
        return 200;
    }


//    public String toString1() {
//        return "BiologyStudent{" +
//                "studienfach='" + studienfach + '\'' +
//                "studienfach='" + getName() + '\'' +
//                '}';
//    }


}
