package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import UserData.DBUtil;

import model.Hczjob;

public class HCZJobUtil {

	public static List<Hczjob> getJobs() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String qString = "Select u from Hczjob u";
		TypedQuery<Hczjob> q = em.createQuery(qString, Hczjob.class);
		List<Hczjob> jobs = null;
		try {
			jobs = q.getResultList();
		} catch (NoResultException e) {
			System.out.println(e);
		} finally {
			em.close();
		}
		return jobs;
		
	}
	public static  Hczjob getJob(float jobid) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String qString = "Select u from Hczjob u where u.jobid= :jobid";
		TypedQuery<Hczjob> q = em.createQuery(qString, Hczjob.class);
		q.setParameter("jobid", jobid);
		Hczjob job = null;
		try {
			job = q.getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e);
		} finally {
			em.close();
		}
		return job;
		
	}
}
