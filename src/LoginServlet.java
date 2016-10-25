

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HCZApplicationStatusUtil;
import Util.HCZApplicationUtil;
import Util.HCZUserUtil;
import Util.HczInterviewQuestionUtil;
import model.Hczapplication;
import model.Hczapplicationstatus;
import model.Hczinterviewquestion;
import model.Hczuser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nextUrl = "";
		HttpSession session = request.getSession();
		Hczuser user = HCZUserUtil.isValidUser(username, password);
		if(user != null){		
			request.getSession().setAttribute("currentApplication", "<a href=\"applicationStatusList.jsp\">Click here to select an application</a>");
			List<Hczapplication> applicationList = HCZApplicationUtil.getApplicationList();
			List<Hczapplicationstatus> applicationStatusList = HCZApplicationStatusUtil.getApplicationStatusList();
			List<Hczinterviewquestion> hrQuestionList = HczInterviewQuestionUtil.getQuestionList(1);
			List<Hczinterviewquestion> secondInterviewQuestionList = HczInterviewQuestionUtil.getQuestionList(2);
			List<Hczinterviewquestion> groupInterviewQuestionList = HczInterviewQuestionUtil.getQuestionList(3);
			List<Hczinterviewquestion> testQuestionList = HczInterviewQuestionUtil.getQuestionList(4);
			session.setAttribute("user", user);
			session.setAttribute("applicationList", applicationList);
			session.setAttribute("applicationStatusList", applicationStatusList);		
			session.setAttribute("hrQuestionList", hrQuestionList);
			session.setAttribute("secondInterviewQuestionList", secondInterviewQuestionList);
			session.setAttribute("groupInterviewQuestionList", groupInterviewQuestionList);
			session.setAttribute("testQuestionList", testQuestionList);
			nextUrl = "/applicationStatusList.jsp";
		}
		else{
			nextUrl = "/hrLogin.jsp";
		}
		
		response.sendRedirect(request.getContextPath()+nextUrl);
	}

}
