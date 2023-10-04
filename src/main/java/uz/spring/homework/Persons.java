package uz.spring.homework;

public class Persons {
    private Teacher teacher;
    private Coder coder;
    String name;

    public Persons(Teacher teacher, Coder coder, String name) {
        this.teacher = teacher;
        this.coder = coder;
        this.name = name;
    }

    public Persons() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Coder getCoder() {
        return coder;
    }

    public void setCoder(Coder coder) {
        this.coder = coder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
