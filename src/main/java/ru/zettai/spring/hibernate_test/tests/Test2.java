package ru.zettai.spring.hibernate_test.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zettai.spring.hibernate_test.entities.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sergeev",
                    "HR", 500);
            session.beginTransaction();
            session.save(employee);
            int emplID = employee.getId();
            Employee loadedEmployee = session.get(Employee.class, emplID);
            session.getTransaction().commit();
            System.out.println(loadedEmployee);
//            //Добавление в таблицу работника Елена
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            //Получение id Елены из предыдущей транзакции
//            int elenaID = employee.getId();
//            //Получение работника по id из базы
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee elena = session.get(Employee.class, elenaID);
//            session.getTransaction().commit();
//            System.out.println(elena);

            System.out.println("Transaction completed.");
        }finally {
            factory.close();
        }

    }
}
