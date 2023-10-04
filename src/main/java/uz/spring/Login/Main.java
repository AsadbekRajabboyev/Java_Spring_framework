package uz.spring.Login;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Address addres = context.getBean("addres", Address.class);

            User user = context.getBean("user", User.class);
            System.out.println("Ismingizni kiriting: ");
            String ism = scanner.nextLine();
            user.setName(ism);

            System.out.println("Loginni kiriting: ");
            String login = scanner.nextLine();
            user.setLogin(login);

            System.out.println("Parolni kiriting: ");
            String parol = scanner.nextLine();
            user.setParol(parol);

            System.out.println("Addresni kiriting: ");
            String address = scanner.nextLine();
            addres.setCity(address);
            System.out.println("ko'chani kiriting: ");
            String street = scanner.nextLine();
            addres.setStreet(street);
            user.setAdd(addres);

            System.out.println("Barcha malumotlar");
            System.out.println(user.toString());
            user.destroyMethod();
        }
    }
}
