package org.lt.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.lt.hibernate.entity.UserInfo;
import org.lt.hibernate.util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
      
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        UserInfo user = new UserInfo();
 
//        user.setId(100);
        user.setUserName("zhuzhu1");
        user.setCreatedBy("system");
        user.setCreatedDate(new Date());
 
        session.save(user);
        session.getTransaction().commit();
    }
}
