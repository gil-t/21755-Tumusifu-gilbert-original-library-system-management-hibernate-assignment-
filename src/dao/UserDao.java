/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UserModel;
import org.hibernate.Query;
import org.hibernate.Session;

public class UserDao {
    private Session ss=null;
    public UserModel createAccount(UserModel u){
        if(emailExist(u.getEmail())==null){
        startSession();
        ss.save(u);
        ss.getTransaction().commit();
        ss.close();
         return u;
        }else{
        return null;
        }
       
    }
    public UserModel Userlogin(UserModel u){
        UserModel dbuser=emailExist(u.getEmail());
        if(dbuser!=null){
            try {
                if(Password.verifyPassword(u.getPasword(),dbuser.getPasword()," ")){
                    // correnct password
                    return dbuser;
                } 
                else{
                 // invalid login
                    dbuser.setPasword("Invalid Login");
                    return dbuser;
                }
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            // account not found
          return null;
        }
        return null;
    }
    public UserModel emailExist(String email){
        startSession();
        Query q=ss.createQuery("from UserModel where email=:email");
        q.setParameter("email", email);
        List<UserModel> users= q.list();
        ss.close();
      return users.size()>0?users.get(0):null;
    }
    public void startSession(){
          ss=HibernateUtil.getSessionFactory().openSession();
          ss.beginTransaction();
    } 

    public UserDao() {
    }
    
    
}

