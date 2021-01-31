package ru.zettai.spring.hibernate_test.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zettai.spring.hibernate_test.entities.Employee;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            //получаем всех работников из БД
//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();
//            employees.forEach(System.out::println);
            List<Employee> employees = session.createQuery("from Employee " +
                    "where name = 'Elena' AND salary > 500").getResultList();
            employees.forEach(System.out::println);

            session.getTransaction().commit();
            System.out.println("Transaction completed.");
        }
    }
}
