/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.BookCategoryModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Book_CategoryDao {
   static SessionFactory sf;
   static Transaction trans;
   public BookCategoryModel SaveBookCategory(BookCategoryModel book){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.save(book);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
      public BookCategoryModel UpdateBookCategory(BookCategoryModel book){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.update(book);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
      public BookCategoryModel DeleteBookCategory(BookCategoryModel book){
     sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
       try {
           trans=ses.beginTransaction();
           ses.delete(book);
           trans.commit();
       } catch (Exception e) {
       }
     finally{
           ses.close();
       }
       return null;
   }
  public List getBookCategory(){
      sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
     //List<ClientModel> model=new ArrayList<>();
    try {
        ses.beginTransaction();
        Query q = ses.createQuery ("from Book_Category_Tb"); 
    } catch (Exception e) {
    }
       return null;
}

    
}
