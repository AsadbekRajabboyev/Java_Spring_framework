package uz.spring.tasks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("beanUser", User.class);
        System.out.println(user.getAge() + "\n" + user.getName());
        context.close();
    }
}
