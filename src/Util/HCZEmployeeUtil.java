package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import UserData.DBUtil;
import model.Hczapplicationstatus;
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
}
