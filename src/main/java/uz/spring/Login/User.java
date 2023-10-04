package uz.spring.Login;

import com.sun.org.apache.xml.internal.security.Init;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
    private String name;
    private String login;
    private  int age;
    private String parol;
    private Address add;

    public User() {
    }

    public User(String name, String login, int age, String parol, Address add) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.parol = parol;
        this.add = add;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", parol='" + parol + '\'' +
                ", add=" + add +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
    public void destroyMethod(){
        System.out.println("Destroy bo'ldi");
    }
    public void initMethod(){
        System.out.println("Init method");
    }
}
