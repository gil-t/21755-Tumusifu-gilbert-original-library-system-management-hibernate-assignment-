
package dao;
import model.BookModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDao {
   static SessionFactory sf;
   static Transaction trans;
   public BookModel SaveBook(BookModel client){
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
      public BookModel UpdateBook(BookModel client){
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
      public BookModel Deletebook(BookModel client){
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
