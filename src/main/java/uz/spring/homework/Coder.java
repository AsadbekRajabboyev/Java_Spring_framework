package uz.spring.homework;

public class Coder implements Person{
    private String name;
    private int age;
    private String getJobName = "coder";
    //set -> qoyish
    //get -> olish

    public Coder(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Coder() {
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

    @Override
    public String getJob() {
        return getJobName;
    }
}
