

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
				
		long statusDot = Long.parseLong(request.getParameter("statusDot"));	
		long statusID = Long.parseLong(request.getParameter("statusId"));	
		long statusNationality = Long.parseLong(request.getParameter("statusNationality"));	
		long statusHistory = Long.parseLong(request.getParameter("statusHistory"));	
		long statusDegree = Long.parseLong(request.getParameter("statusDegree"));	
		long statusPanel = Long.parseLong(request.getParameter("statusPanel"));	
		long statusAlcohol = Long.parseLong(request.getParameter("statusAlcohol"));	
		long statusHrinterview = Long.parseLong(request.getParameter("statusHrinterview"));
		long statusVeteran = Long.parseLong(request.getParameter("statusVeteran"));	
		long statusSecondinterview = Long.parseLong(request.getParameter("statusSecondinterview"));	
		long statusGroupinterview = Long.parseLong(request.getParameter("statusGroupinterview"));	
		long statusTest = Long.parseLong(request.getParameter("statusTest"));	
		long statusAprroval = Long.parseLong(request.getParameter("statusApproval"));	
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
