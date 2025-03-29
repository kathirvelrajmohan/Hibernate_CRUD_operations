package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args){
        SessionFactory factory= new Configuration()
                .addAnnotatedClass(com.dev.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Student s1 = session.find(Student.class, 104);
        session.remove(s1);
        transaction.commit();
        session.close();
        factory.close();
    }
}
