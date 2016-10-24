

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HCZApplicationStatusUtil;
import model.Hczapplicationstatus;
import model.Hczuser;

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
		
		long statusID = Long.parseLong(request.getParameter("statusId"));	
		Hczapplicationstatus applicationStatus = HCZApplicationStatusUtil.getApplicationStatus(statusID);
				
		Hczuser user = (Hczuser) session.getAttribute("user");
		long role = user.getUserrole();
		
		if(role == 1){
			String[] statusHrinterviewString = request.getParameterValues("hrInterview");
			if(statusHrinterviewString == null){
				applicationStatus.setHrinterview(0);
			}
			else{
				applicationStatus.setHrinterview(1);
				applicationStatus.setStatus("HR Interview Scheduled");
			}
		}
		if(role == 2){
			String[] statusDegreeString = request.getParameterValues("degree");
			if(statusDegreeString == null){
				applicationStatus.setEducationdegree(0);
			}
			else{
				applicationStatus.setEducationdegree(1);
			}
		}
		if(role == 3){
			String[] statusHistoryString = request.getParameterValues("history");
			String[] statusVeteranString = request.getParameterValues("veteran");
			if(statusHistoryString == null){
				applicationStatus.setWorkhistory(0);
			}
			else{
				applicationStatus.setWorkhistory(1);
			}
			if(statusVeteranString == null){
				applicationStatus.setVeteran(0);
			}
			else{
				applicationStatus.setVeteran(1);
			}
		}
		if(role == 4){
			String[] statusDotString = request.getParameterValues("dot");
			String[] statusAlcoholString = request.getParameterValues("alcohol");
			String[] statusPanelString = request.getParameterValues("panel");
			if(statusDotString == null){
				applicationStatus.setDottest(0);
			}
			else{
				applicationStatus.setDottest(1);
			}
			if(statusAlcoholString == null){
				applicationStatus.setAlcoholtest(0);
			}
			else{
				applicationStatus.setAlcoholtest(1);
			}
			if(statusPanelString == null){
				applicationStatus.setStandardpaneltest(0);
			}
			else{
				applicationStatus.setStandardpaneltest(1);
			}
			if(role == 5){
				String[] statusNationalityString = request.getParameterValues("nationality");
				if(statusNationalityString == null){
					applicationStatus.setNationality(0);
				}
				else{
					applicationStatus.setNationality(1);
				}
			}
			if(role == 6){
				long statusAprroval = 0;
				long statusGroupinterview = 0;
				long statusSecondinterview = 0;
				
				String[] statusSecondString = request.getParameterValues("second");
				String[] statusOfferString = request.getParameterValues("offer");
				String[] statusGroupString = request.getParameterValues("group");
				if(statusSecondString == null){
					applicationStatus.setManagerinterview(0);
					statusSecondinterview = 0;
				}
				else{
					applicationStatus.setManagerinterview(1);
					statusSecondinterview = 1;
				}
				if(statusOfferString == null){
					statusAprroval = 0;
				}
				else{
					statusAprroval = 1;
				}
				if(statusGroupString == null){
					applicationStatus.setGroupinterview(0);
					statusGroupinterview = 0;
				}
				else{
					applicationStatus.setGroupinterview(1);
					statusGroupinterview = 1;
				}
				
				if(statusAprroval == 0){
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
				else{
					status = "Processing";
				}
			}
		}			
		
		applicationStatus.setStatus(status);
				
		HCZApplicationStatusUtil.updateStatus(applicationStatus);
		session.setAttribute("applicationStatus", applicationStatus);
		
		nextUrl = "/applicationStatusList.jsp";
		
		response.sendRedirect(request.getContextPath()+nextUrl);
	}

}
