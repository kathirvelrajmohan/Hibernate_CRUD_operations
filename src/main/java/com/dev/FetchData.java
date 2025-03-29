package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args){
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.dev.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();

        Student a1 = session.find(Student.class, 103); // Eager Fetching
        Student a2 = session.get(Student.class, 102); // Eager Fetching
        Student a3 = session.byId(Student.class).getReference(101); // Lazy Fetching
        //System.out.println(a1);
    }
}
