package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
import model.Hczapplicationstatus;
import model.Hczjob;
import model.Hczuser;
import model.Hczuserprofile;

public class HCZEmployeeUtil {

	
	 public static void insert(Hczuserprofile app) {
	    
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

	 public static void update(Hczuserprofile app) {
	    
		 EntityManager em = DBUtil.getEmFactory().createEntityManager();
		 EntityTransaction trans = em.getTransaction();
		 //System.out.println("DbBullhorn: begin transaction");
		 try {
		 trans.begin();
		 em.merge(app);
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
	 public static  Hczuserprofile getprofile(float userid) {
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			String qString = "Select u from Hczuserprofile u where u.userid= :userid";
			TypedQuery<Hczuserprofile> q = em.createQuery(qString, Hczuserprofile.class);
			q.setParameter("userid", userid);
			Hczuserprofile user = null;
			try {
				user = q.getSingleResult();
			} catch (NoResultException e) {
				System.out.println(e);
			} finally {
				em.close();
			}
			return user;
			
		}
	 public static Hczuserprofile isValidUser(String username, String password) {
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			String qString = "Select u from Hczuserprofile u where u.username = :username and u.password = :password";
			TypedQuery<Hczuserprofile> q = em.createQuery(qString, Hczuserprofile.class);
			q.setParameter("username", username);
			q.setParameter("password", password);
			Hczuserprofile user = null;
			try {
				user = q.getSingleResult();
			} catch (Exception e) {
			} finally {
				em.close();
			}
			return user;
		}
}
