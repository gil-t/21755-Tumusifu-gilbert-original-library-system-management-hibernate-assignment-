/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.CheckInModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T gil
 */
public class CheckInDao {
   static SessionFactory sf;
   static Transaction trans;
   public CheckInModel SaveCheckIn(CheckInModel client){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.save(client);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
      public CheckInModel UpdateCheckIn(CheckInModel client){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.update(client);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
      public CheckInModel DeleteCheckIn(CheckInModel client){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.delete(client);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
    }
