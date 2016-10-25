

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HczInterviewQuestionUtil;
import model.Hczapplication;
import model.Hczapplicationstatus;
import model.Hczinterviewanswer;
import model.Hczinterviewquestion;

/**
 * Servlet implementation class InputAnswerServlet
 */
@WebServlet("/InputAnswerServlet")
public class InputAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputAnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String nextUrl = "";
		String action = request.getParameter("action");
		Hczapplicationstatus status = (Hczapplicationstatus) session.getAttribute("applicationStatus");
		Hczapplication hczapplication = status.getHczapplication();
		if(action.equalsIgnoreCase("hrInput")){
			List<Hczinterviewquestion> hrQuestionList = HczInterviewQuestionUtil.getQuestionList(1);
			for(int i = 0; i <hrQuestionList.size(); i++){
				long questionID = hrQuestionList.get(i).getInterviewquestionid();
				String answer = request.getParameter("Answer" + questionID);
				Hczinterviewanswer interviewAnswer = new Hczinterviewanswer();
				interviewAnswer.setAnswer(answer);
				interviewAnswer.setInterviewtype(1);
				interviewAnswer.setHczapplication(hczapplication);
				interviewAnswer.setHczinterviewquestion(HczInterviewQuestionUtil.getQuestion(questionID));
				HczInterviewQuestionUtil.add(interviewAnswer);
			}
			List<Hczinterviewanswer> hrAnswerList = HczInterviewQuestionUtil.getAnswerList(1, hczapplication.getApplicationid());
			session.setAttribute("hrAnswerList", hrAnswerList);
			nextUrl = "/hrAnswers.jsp";
		}
		if(action.equalsIgnoreCase("secondInput")){
			System.out.println("Second");
			List<Hczinterviewquestion> hrQuestionList = HczInterviewQuestionUtil.getQuestionList(1);
			for(int i = 0; i <hrQuestionList.size(); i++){
				long questionID = hrQuestionList.get(i).getInterviewquestionid();
				String answer = request.getParameter("Answer2" + questionID);
				Hczinterviewanswer interviewAnswer = new Hczinterviewanswer();
				interviewAnswer.setAnswer(answer);
				interviewAnswer.setInterviewtype(2);
				interviewAnswer.setHczapplication(hczapplication);
				interviewAnswer.setHczinterviewquestion(HczInterviewQuestionUtil.getQuestion(questionID));
				HczInterviewQuestionUtil.add(interviewAnswer);
			}
			List<Hczinterviewanswer> secondAnswerList = HczInterviewQuestionUtil.getAnswerList(2, hczapplication.getApplicationid());
			session.setAttribute("secondAnswerList", secondAnswerList);
			System.out.println(secondAnswerList.get(0).getAnswer());
			nextUrl = "/secondAnswers.jsp";
		}
		if(action.equalsIgnoreCase("groupInput")){
			List<Hczinterviewquestion> hrQuestionList = HczInterviewQuestionUtil.getQuestionList(1);
			for(int i = 0; i <hrQuestionList.size(); i++){
				long questionID = hrQuestionList.get(i).getInterviewquestionid();
				String answer = request.getParameter("Answer3" + questionID);
				Hczinterviewanswer interviewAnswer = new Hczinterviewanswer();
				interviewAnswer.setAnswer(answer);
				interviewAnswer.setInterviewtype(1);
				interviewAnswer.setHczapplication(hczapplication);
				interviewAnswer.setHczinterviewquestion(HczInterviewQuestionUtil.getQuestion(questionID));
				HczInterviewQuestionUtil.add(interviewAnswer);
			}
			List<Hczinterviewanswer> groupAnswerList = HczInterviewQuestionUtil.getAnswerList(3, hczapplication.getApplicationid());
			session.setAttribute("groupAnswerList", groupAnswerList);
			nextUrl = "/groupAnswers.jsp";
		}
		if(action.equalsIgnoreCase("testInput")){
			List<Hczinterviewquestion> hrQuestionList = HczInterviewQuestionUtil.getQuestionList(1);
			for(int i = 0; i <hrQuestionList.size(); i++){
				long questionID = hrQuestionList.get(i).getInterviewquestionid();
				String answer = request.getParameter("Answer4" + questionID);
				Hczinterviewanswer interviewAnswer = new Hczinterviewanswer();
				interviewAnswer.setAnswer(answer);
				interviewAnswer.setInterviewtype(1);
				interviewAnswer.setHczapplication(hczapplication);
				interviewAnswer.setHczinterviewquestion(HczInterviewQuestionUtil.getQuestion(questionID));
				HczInterviewQuestionUtil.add(interviewAnswer);
			}
			List<Hczinterviewanswer> testAnswerList = HczInterviewQuestionUtil.getAnswerList(4, hczapplication.getApplicationid());
			session.setAttribute("testAnswerList", testAnswerList);
			nextUrl = "/testAnswers.jsp";
		}	
		response.sendRedirect(request.getContextPath()+nextUrl);
	}

}
