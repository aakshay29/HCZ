package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import UserData.DBUtil;
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
}
