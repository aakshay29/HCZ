package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
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
	public static Hczapplicationstatus getApplicationStatus(int statusID) {
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
}
