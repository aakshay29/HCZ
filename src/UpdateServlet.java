

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HCZApplicationStatusUtil;
import model.Hczapplicationstatus;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		String status = "";
		int statusID = Integer.parseInt(request.getParameter("statusID"));	
		int statusNationality = Integer.parseInt(request.getParameter("statusNationality"));	
		int statusHistory = Integer.parseInt(request.getParameter("statusHistory"));	
		int statusDegree = Integer.parseInt(request.getParameter("statusDegree"));	
		int statusPanel = Integer.parseInt(request.getParameter("statusPanel"));	
		int statusDot = Integer.parseInt(request.getParameter("statusDot"));	
		int statusAlcohol = Integer.parseInt(request.getParameter("statusAlcohol"));	
		int statusVeteran = Integer.parseInt(request.getParameter("statusVeteran"));	
		int statusHrinterview = Integer.parseInt(request.getParameter("statusHrinterview"));	
		int statusSecondinterview = Integer.parseInt(request.getParameter("statusSecondinterview"));	
		int statusGroupinterview = Integer.parseInt(request.getParameter("statusGroupinterview"));	
		int statusTest = Integer.parseInt(request.getParameter("statusTest"));	
		int statusAprroval = Integer.parseInt(request.getParameter("statusApproval"));	
		Hczapplicationstatus applicationStatus = HCZApplicationStatusUtil.getApplicationStatus(statusID);
			
		if(statusAprroval == 2){
			status = "We regret to inform you that we are no longer processing your application. Good luck.";
		}
		else if(statusAprroval == 1){
			status = "Congratulations! You have got the job.";
		}
		else if(statusGroupinterview == 1){
			status = "Group interview scheduled";
		}
		else if(statusSecondinterview == 1){
			status = "Second interview scheduled";
		}
		else if(statusHrinterview == 1){
			status = "HR interview scheduled";
		}
		else{
			status = "Processing";
		}
		
		applicationStatus.setAlcoholtest(statusAlcohol);
		applicationStatus.setCodingtest(statusTest);
		applicationStatus.setDottest(statusDot);
		applicationStatus.setEducationdegree(statusDegree);
		applicationStatus.setGroupinterview(statusGroupinterview);
		applicationStatus.setHrinterview(statusHrinterview);
		applicationStatus.setManagerinterview(statusSecondinterview);
		applicationStatus.setNationality(statusNationality);
		applicationStatus.setStandardpaneltest(statusPanel);
		applicationStatus.setStatus(status);
		applicationStatus.setVeteran(statusVeteran);
		applicationStatus.setWorkhistory(statusHistory);
				
		HCZApplicationStatusUtil.updateStatus(applicationStatus);
		session.setAttribute("applicationStatus", applicationStatus);
		
		nextUrl = "/applicationList.jsp";
		
		response.sendRedirect(request.getContextPath()+nextUrl);
	}

}
