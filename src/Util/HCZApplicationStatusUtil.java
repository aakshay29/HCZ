package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
import model.Hczapplication;
import model.Hczapplicationstatus;

public class HCZApplicationStatusUtil {
	public static List<Hczapplicationstatus> getApplicationStatusList() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczapplicationstatus> query = em.createQuery("SELECT a FROM Hczapplicationstatus a", Hczapplicationstatus.class);
		List<Hczapplicationstatus> applicationStatusList = null;
		try {
			applicationStatusList = query.getResultList();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return applicationStatusList;
	}
	public static Hczapplicationstatus getApplicationStatus(long statusID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczapplicationstatus> query = em.createQuery("SELECT s FROM Hczapplicationstatus s where s.statusid = :statusID", Hczapplicationstatus.class);
		query.setParameter("statusID", statusID);
		Hczapplicationstatus applicationStatus = null;
		try {
			applicationStatus = query.getSingleResult();		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return applicationStatus;
	}
	public static void updateStatus(Hczapplicationstatus status) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(status);
			trans.commit();
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}
	}
	
	 public static void insert(Hczapplicationstatus app) {
		    
		 EntityManager em = DBUtil.getEmFactory().createEntityManager();
		 EntityTransaction trans = em.getTransaction();
		 //System.out.println("DbBullhorn: begin transaction");
		 try {
		 trans.begin();
		 em.persist(app);
		 System.out.println("HCZjob application status: commit transaction");
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
