package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String[] args){
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.dev.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Student s1 = new Student();
        s1.setTech("Digital Marketing");
        s1.setStudentId(104);
        s1.setStudentName("Jenish");

        session.merge(s1);

        transaction.commit();

        session.close();
        factory.close();
    }
}
