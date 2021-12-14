package com.kaankln.base;

import com.kaankln.hibernate.HibernateUtil;
import com.kaankln.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {

    private SessionFactory sessionFactory;

    public BaseDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    protected Session getCurrentSession(){

        Session session = sessionFactory.openSession();

        return session;
    }
}
