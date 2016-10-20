package Util;

import java.util.List;

import javax.persistence.EntityManager;
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
}
