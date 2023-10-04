package uz.spring.homework;

public class Teacher implements Person{
    String name;  // default 1-package ichida ochiq

    public int age; //public bu hamma joyda ochiq.

    private int oylik; // private faqatgina class ichida ochiq
    private String jobb="teacher";

    public Teacher(String name, int age, int oylik, String jobb) {
        this.name = name;
        this.age = age;
        this.oylik = oylik;
        this.jobb = jobb;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOylik() {
        return oylik;
    }

    public void setOylik(int oylik) {
        this.oylik = oylik;
    }

    public String getJobb() {
        return jobb;
    }

    public void setJobb(String jobb) {
        this.jobb = jobb;
    }

    @Override
    public String getJob() {
        return getJobb();
    }
}
