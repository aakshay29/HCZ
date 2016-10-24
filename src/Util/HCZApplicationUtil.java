package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
import model.Hczapplication;

public class HCZApplicationUtil {
	public static List<Hczapplication> getApplicationList() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczapplication> query = em.createQuery("SELECT a FROM Hczapplication a", Hczapplication.class);
		List<Hczapplication> applicationList = null;
		try {
			applicationList = query.getResultList();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return applicationList;
	}
	public static Hczapplication getApplication(int applicationID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczapplication> query = em.createQuery("SELECT a FROM Hczapplication a where a.applicationid = :applicationID", Hczapplication.class);
		query.setParameter("applicationID", applicationID);
		Hczapplication application = null;
		try {
			application = query.getSingleResult();		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return application;
	}
	
	 public static void update(Hczapplication app) {
		 EntityManager em = DBUtil.getEmFactory().createEntityManager();
		 EntityTransaction trans = em.getTransaction();
		 try {
		 trans.begin();
		 em.merge(app);
		 trans.commit();
		 } catch (Exception e) {
		 System.out.println(e);
		 trans.rollback();
		 } finally {
		 em.close();
		 }
		 }
	 
	 public static void insert(Hczapplication app) {
		    
		 EntityManager em = DBUtil.getEmFactory().createEntityManager();
		 EntityTransaction trans = em.getTransaction();
		 //System.out.println("DbBullhorn: begin transaction");
		 try {
		 trans.begin();
		 em.persist(app);
		 System.out.println("HCZjob applucation: commit transaction");
		 trans.commit();
		 } catch (Exception e) {
		 e.getCause().getMessage();
		 //System.out.println("DbBullhorn: rollback transaction");
		 trans.rollback();
		 } finally {
		 //System.out.println("DbBullhorn: close em");
		 em.close();
		 }
		 
	 } 
	 
	 
	 
}
