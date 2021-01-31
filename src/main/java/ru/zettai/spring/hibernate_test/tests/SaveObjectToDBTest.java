package ru.zettai.spring.hibernate_test.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zettai.spring.hibernate_test.entities.Employee;

public class SaveObjectToDBTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try(Session session = factory.getCurrentSession()) {
            Employee employee = new Employee("Zhan-Michel", "Bayanga",
                    "IT", 550);

            //работа с транзакцией
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
        System.out.println("Transaction completed.");

    }
}
