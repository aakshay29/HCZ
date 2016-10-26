package Util;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
import model.Hczuser;

public class HCZUserUtil {
	public static Hczuser isValidUser(String username, String password) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String qString = "Select u from Hczuser u where u.username = :username and u.userpassword = :password";
		TypedQuery<Hczuser> q = em.createQuery(qString, Hczuser.class);
		q.setParameter("username", username);
		q.setParameter("password", password);
		Hczuser user = null;
		try {
			user = q.getSingleResult();
		} catch (Exception e) {
		} finally {
			em.close();
		}
		return user;
	}

}
