package ru.zettai.spring.hibernate_test.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zettai.spring.hibernate_test.entities.Employee;

public class UpdateObjectInDBTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            //Получаем работника по ID=2 и обновляем у него конкретное поле
            Employee empID2 = session.get(Employee.class, 2);
            empID2.setSalary(1500);
            //Изменяем поле нескольких сотрудников через создание запроса
            session.createQuery("update Employee set salary=1000 " +
                    "where name='Elena'").executeUpdate();
            session.getTransaction().commit();
            System.out.println("Transaction completed.");

        }finally {
            factory.close();
        }
    }
}
