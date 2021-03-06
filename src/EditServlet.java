

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
import Util.HczInterviewQuestionUtil;
import model.Hczapplication;
import model.Hczapplicationstatus;
import model.Hczinterviewanswer;
import model.Hczuser;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
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
		String action = request.getParameter("action");	
		String innerHTML = "";
		HttpSession session = request.getSession();
		String nextUrl = "";
		Hczuser user = (Hczuser) session.getAttribute("user");
		Hczapplicationstatus applicationStatus = null;
		if(action.equalsIgnoreCase("AL")){
			int applicationID = Integer.parseInt(request.getParameter("applicationID"));	
			Hczapplication application = HCZApplicationUtil.getApplication(applicationID);
			applicationStatus = application.getHczapplicationstatuses().get(0);
		}
		if(action.equalsIgnoreCase("ASL")){
			int statusID = Integer.parseInt(request.getParameter("statusID"));	
			applicationStatus = HCZApplicationStatusUtil.getApplicationStatus(statusID);
		}	
		session.setAttribute("applicationStatus", applicationStatus);
		request.getSession().setAttribute("currentApplication", "This interview is set for " + applicationStatus.getHczapplication().getApplicantname() + ".<br/>Application ID: " + applicationStatus.getHczapplication().getApplicationid() + "<br/><a href=\"applicationStatusList.jsp\">Switch to another application here</a><br/>");
		long role = user.getUserrole();
		if(role == 1){//HR Manager - HR Interview, 
			List<Hczinterviewanswer> hrAnswerList = HczInterviewQuestionUtil.getAnswerList(1, applicationStatus.getHczapplication().getApplicationid());
			session.setAttribute("hrAnswerList", hrAnswerList);
			innerHTML = "<br/><br/><a href=\"hrInterviewForm.jsp\">Take HR Interview</a><br/><br/>"+
					"<a href=\"hrAnswers.jsp\">View HR Interview Answers</a><br/><br/>"+
					"ID: <input type=\"text\" name=\"statusId\""+
					"value=\""+applicationStatus.getStatusid()+"\"readonly>"+
					"<br />"+
					"<br />Name: <input type=\"text\" name=\"statusName\""+
						"value=\""+applicationStatus.getHczapplication().getApplicantname()+"\"readonly> <br />"+
					"<br />Status: <input type=\"text\" name=\"statusStatus\""+
						"value=\""+applicationStatus.getStatus()+"\"readonly>"+
					"<br /><br />";
			String hrInterviewHtml = "<input type=\"checkbox\" name=\"hrInterview\" value=\"hrInterview\">HR Interview";
			if(applicationStatus.getHrinterview() == 1){
				hrInterviewHtml = "<input type=\"checkbox\" name=\"hrInterview\" value=\"hrInterview\" checked>HR Interview";
			}
			
			innerHTML += hrInterviewHtml + "<br/>"+
					"<br />"+
					"<input type=\"hidden\""+
					"name=\"action\" value=\"update\"> <input type=\"submit\""+
					"value=\"Update\" id=\"submit\">";
			
			nextUrl = "/editApplication.jsp";
		}
		if(role == 2){//HR Specialist - Degrees
			innerHTML = "ID: <input type=\"text\" name=\"statusId\""+
					"value=\""+applicationStatus.getStatusid()+"\"readonly>"+
					"<br />"+
					"<br />Name: <input type=\"text\" name=\"statusName\""+
						"value=\""+applicationStatus.getHczapplication().getApplicantname()+"\"readonly> <br />"+
					"<br />Status: <input type=\"text\" name=\"statusStatus\""+
						"value=\""+applicationStatus.getStatus()+"\"readonly>"+
					"<br /><br />";
			String degreeHtml = "<input type=\"checkbox\" name=\"degree\" value=\"degree\">Education Degree";
			if(applicationStatus.getEducationdegree() == 1){
				degreeHtml = "<input type=\"checkbox\" name=\"degree\" value=\"degree\" checked>Education Degree";
			}
			
			innerHTML += degreeHtml + "<br/>"+
					"<br />"+
					"<input type=\"hidden\""+
					"name=\"action\" value=\"update\"> <input type=\"submit\""+
					"value=\"Update\" id=\"submit\">";
			
			nextUrl = "/editApplication.jsp";
		}
		if(role == 3){//HR Assistant - History, Reference, Veteran
			innerHTML = "ID: <input type=\"text\" name=\"statusId\""+
					"value=\""+applicationStatus.getStatusid()+"\"readonly>"+
					"<br />"+
					"<br />Name: <input type=\"text\" name=\"statusName\""+
						"value=\""+applicationStatus.getHczapplication().getApplicantname()+"\"readonly> <br />"+
					"<br />Status: <input type=\"text\" name=\"statusStatus\""+
						"value=\""+applicationStatus.getStatus()+"\"readonly>"+
					"<br /><br />";
			
			String historyHtml = "<input type=\"checkbox\" name=\"history\" value=\"history\">History<br />";
			if(applicationStatus.getWorkhistory() == 1){
				historyHtml = "<input type=\"checkbox\" name=\"history\" value=\"history\" checked>History<br />";
			}
			String veteranHtml = "<input type=\"checkbox\" name=\"veteran\" value=\"veteran\">Veteran";
			if(applicationStatus.getVeteran() == 1){
				veteranHtml = "<input type=\"checkbox\" name=\"veteran\" value=\"veteran\" checked>Veteran";
			}
			
			innerHTML += historyHtml+veteranHtml + "<br/>"+
					"<br />"+
					"<input type=\"hidden\""+
					"name=\"action\" value=\"update\"> <input type=\"submit\""+
					"value=\"Update\" id=\"submit\">";
			
			nextUrl = "/editApplication.jsp";
		}
		if(role == 4){//Health Care Professional - Drug
			innerHTML = "ID: <input type=\"text\" name=\"statusId\""+
					"value=\""+applicationStatus.getStatusid()+"\"readonly>"+
					"<br />"+
					"<br />Name: <input type=\"text\" name=\"statusName\""+
						"value=\""+applicationStatus.getHczapplication().getApplicantname()+"\"readonly> <br />"+
					"<br />Status: <input type=\"text\" name=\"statusStatus\""+
						"value=\""+applicationStatus.getStatus()+"\"readonly>"+
					"<br /><br />";
			String dotHtml = "<input type=\"checkbox\" name=\"dot\" value=\"dot\">DOT Test<br />";
			if(applicationStatus.getDottest() == 1){
				dotHtml = "<input type=\"checkbox\" name=\"dot\" value=\"dot\" checked>DOT Test<br />";
			}
			String alcoholHtml = "<input type=\"checkbox\" name=\"alcohol\" value=\"alcohol\">Alcohol Test<br />";
			if(applicationStatus.getAlcoholtest() == 1){
				alcoholHtml = "<input type=\"checkbox\" name=\"alcohol\" value=\"alcohol\" checked>Alcohol Test<br />";
			}
			String panelHtml = "<input type=\"checkbox\" name=\"panel\" value=\"panel\">Panel Test";
			if(applicationStatus.getStandardpaneltest() == 1){
				panelHtml = "<input type=\"checkbox\" name=\"panel\" value=\"panel\" checked>Panel Test";
			}
			
			innerHTML += dotHtml+alcoholHtml+panelHtml + "<br/>"+
					"<br />"+
					"<input type=\"hidden\""+
					"name=\"action\" value=\"update\"> <input type=\"submit\""+
					"value=\"Update\" id=\"submit\">";
			
			nextUrl = "/editApplication.jsp";
		}
		if(role == 5){//Compliance Officer - Nationality
			innerHTML = "ID: <input type=\"text\" name=\"statusId\""+
					"value=\""+applicationStatus.getStatusid()+"\"readonly>"+
					"<br />"+
					"<br />Name: <input type=\"text\" name=\"statusName\""+
						"value=\""+applicationStatus.getHczapplication().getApplicantname()+"\"readonly> <br />"+
					"<br />Status: <input type=\"text\" name=\"statusStatus\""+
						"value=\""+applicationStatus.getStatus()+"\"readonly>"+
					"<br /><br />";
			String nationalityHtml = "<input type=\"checkbox\" name=\"nationality\" value=\"nationality\">Nationality Test";
			if(applicationStatus.getNationality() == 1){
				nationalityHtml = "<input type=\"checkbox\" name=\"nationality\" value=\"nationality\" checked>Nationality Test";
			}
			
			innerHTML += nationalityHtml + "<br/>"+
					"<br />"+
					"<input type=\"hidden\""+
					"name=\"action\" value=\"update\"> <input type=\"submit\""+
					"value=\"Update\" id=\"submit\">";
			
			nextUrl = "/editApplication.jsp";
		}
		if(role == 6){//Hiring Manager - Second Interview
			List<Hczinterviewanswer> secondAnswerList = HczInterviewQuestionUtil.getAnswerList(2, applicationStatus.getHczapplication().getApplicationid());
			session.setAttribute("secondAnswerList", secondAnswerList);
			List<Hczinterviewanswer> groupAnswerList = HczInterviewQuestionUtil.getAnswerList(3, applicationStatus.getHczapplication().getApplicationid());
			session.setAttribute("groupAnswerList", groupAnswerList);
			List<Hczinterviewanswer> testAnswerList = HczInterviewQuestionUtil.getAnswerList(4, applicationStatus.getHczapplication().getApplicationid());
			session.setAttribute("testAnswerList", testAnswerList);
			
			innerHTML = "<br/><br/><a href=\"secondInterviewForm.jsp\">Take Second Interview</a><br/><br/>"+
					"<a href=\"groupInterviewForm.jsp\">Take Group Interview</a><br/><br/>"+
					"<a href=\"testForm.jsp\">Take Test</a><br/><br/>"+
					
					"<a href=\"secondAnswers.jsp\">View Second Interview Answers</a><br/><br/>"+
					"<a href=\"groupAnswers.jsp\">View Group Interview Answers</a><br/><br/>"+
					"<a href=\"testAnswers.jsp\">View Test Answers</a><br/><br/>"+
					
					"ID: <input type=\"text\" name=\"statusId\""+
					"value=\""+applicationStatus.getStatusid()+"\"readonly>"+
					"<br />"+
					"<br />Name: <input type=\"text\" name=\"statusName\""+
						"value=\""+applicationStatus.getHczapplication().getApplicantname()+"\"readonly> <br />"+
					"<br />Status: <input type=\"text\" name=\"statusStatus\""+
						"value=\""+applicationStatus.getStatus()+"\"readonly>"+
					"<br /><br />";
			String secondHtml = "<input type=\"checkbox\" name=\"second\" value=\"second\">Second Interview<br />";
			if(applicationStatus.getManagerinterview() == 1){
				secondHtml = "<input type=\"checkbox\" name=\"second\" value=\"second\" checked>Second Interview<br />";
			}
			String fourthHtml = "<input type=\"checkbox\" name=\"group\" value=\"group\">Group Interview<br />";
			if(applicationStatus.getGroupinterview() == 1){
				fourthHtml = "<input type=\"checkbox\" name=\"group\" value=\"group\" checked>Group Interview<br />";
			}
			String fifthHtml = "<input type=\"checkbox\" name=\"test\" value=\"test\">Test<br />";
			if(applicationStatus.getCodingtest() == 1){
				fifthHtml = "<input type=\"checkbox\" name=\"test\" value=\"test\" checked>Test<br />";
			}
			String sixthHtml = "<input type=\"checkbox\" name=\"reject\" value=\"reject\">Reject<br />";
			String thirdHtml = "<input type=\"checkbox\" name=\"offer\" value=\"offer\">Hire now";
			
			innerHTML += secondHtml + fourthHtml + fifthHtml + sixthHtml + thirdHtml + "<br/>"+
					"<br />"+
					"<input type=\"hidden\""+
					"name=\"action\" value=\"update\"> <input type=\"submit\""+
					"value=\"Update\" id=\"submit\">";
			
			nextUrl = "/editApplication.jsp";
		}
		request.getSession().setAttribute("editApplication", innerHTML);
		response.sendRedirect(request.getContextPath()+nextUrl);
	}
}
