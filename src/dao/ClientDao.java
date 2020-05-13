package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.table.DefaultTableModel;
import model.ClientModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {

    static SessionFactory sf;
    static Transaction trans;

    public ClientModel SaveClient(ClientModel client) {
        sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        try {
            trans = ses.beginTransaction();
            ses.save(client);
            trans.commit();
        } catch (Exception e) {
        } finally {
            ses.close();
        }
        return null;
    }

    public ClientModel UpdateClient(ClientModel client) {
        sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        try {
            trans = ses.beginTransaction();
            ses.update(client);
            trans.commit();
        } catch (Exception e) {
        } finally {
            ses.close();
        }
        return null;
    }

    public ClientModel DeleteClient(ClientModel client) {
        sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        try {
            trans = ses.beginTransaction();
            ses.delete(client);
            trans.commit();
        } catch (Exception e) {
        } finally {
            ses.close();
        }
        return null;
    }
    public List ClientData(ClientModel client){
    sf=HibernateUtil.getSessionFactory();
     Session ses=sf.openSession();
        try {
            
            String Hql="from ClientModel";
            Query q=ses.createQuery(Hql);
            List<ClientModel> Collection=q.list();
            
        } catch (Exception e) {
        }
        return null;

}
}
