package uz.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = classPathXmlApplicationContext.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
    }
}
