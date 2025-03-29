package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Syed");
        s1.setTech("Graphic Designer");

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.dev.Student.class);
//        config.configure();

        SessionFactory factory = new Configuration()
                        .addAnnotatedClass(com.dev.Student.class)
                        .configure()
                        .buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        session.close();

        factory.close();
    }
}