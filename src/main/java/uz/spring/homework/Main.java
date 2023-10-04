package uz.spring.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Persons persons = context.getBean("persons", Persons.class);
        System.out.println(persons.getName()+" "+ persons.getTeacher());
        System.out.println(persons.getCoder().getName());
        System.out.println(persons.getTeacher().getName());
        context.close();
    }
}
