package Util;

import java.util.List;

import javax.persistence.EntityManager;
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
}
