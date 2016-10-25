package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
import model.Hczinterviewanswer;
import model.Hczinterviewquestion;

public class HczInterviewQuestionUtil {
	public static List<Hczinterviewquestion> getQuestionList(int interviewType) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczinterviewquestion> query = em.createQuery("SELECT q FROM Hczinterviewquestion q where q.interviewtype = :interviewType", Hczinterviewquestion.class);
		query.setParameter("interviewType", interviewType);
		List<Hczinterviewquestion> questionList = null;
		try {
			questionList = query.getResultList();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return questionList;
	}
	public static Hczinterviewquestion getQuestion(long questionID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczinterviewquestion> query = em.createQuery("SELECT q FROM Hczinterviewquestion q where q.interviewquestionid = :questionID", Hczinterviewquestion.class);
		query.setParameter("questionID", questionID);
		Hczinterviewquestion question = null;
		try {
			question = query.getSingleResult();		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return question;
	}
	public static void add(Hczinterviewanswer answer) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(answer);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			em.close();
		}
	}
	public static List<Hczinterviewanswer> getAnswerList(int interviewType, long applicationID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();	
		TypedQuery<Hczinterviewanswer> query = em.createQuery("SELECT a FROM Hczinterviewanswer a where a.hczapplication.applicationid = :applicationID and a.interviewtype = :interviewType", Hczinterviewanswer.class);
		query.setParameter("applicationID", applicationID);
		query.setParameter("interviewType", interviewType);
		List<Hczinterviewanswer> answerList = null;
		try {
			answerList = query.getResultList();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return answerList;
	}
}
