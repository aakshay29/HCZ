

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
import model.Hczapplication;
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
		String status = "Processing";
		
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
			long statusAprroval = 2;
			long statusGroupinterview = 2;
			long statusSecondinterview = 2;
			
			String[] statusSecondString = request.getParameterValues("second");
			String[] statusOfferString = request.getParameterValues("offer");
			String[] statusGroupString = request.getParameterValues("group");
			String[] statusRejectString = request.getParameterValues("reject");
			String[] statusTestString = request.getParameterValues("test");
			if(statusSecondString == null){
				applicationStatus.setManagerinterview(0);
				statusSecondinterview = 0;
			}
			else{
				applicationStatus.setManagerinterview(1);
				statusSecondinterview = 1;
			}
			if(statusTestString == null){
				applicationStatus.setCodingtest(0);
			}
			else{
				applicationStatus.setCodingtest(1);
			}
			if(statusRejectString != null){
				statusAprroval = 0;
			}
			if(statusOfferString != null){
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
				status = "Application declined";
			}
			else if(statusAprroval == 1){
				status = "Application approved";
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
			applicationStatus.setStatus(status);
		}
						
		HCZApplicationStatusUtil.updateStatus(applicationStatus);
		session.setAttribute("applicationStatus", applicationStatus);
		
		List<Hczapplication> applicationList = HCZApplicationUtil.getApplicationList();
		List<Hczapplicationstatus> applicationStatusList = HCZApplicationStatusUtil.getApplicationStatusList();
		session.setAttribute("applicationList", applicationList);
		session.setAttribute("applicationStatusList", applicationStatusList);
		
		nextUrl = "/applicationStatusList.jsp";
		
		response.sendRedirect(request.getContextPath()+nextUrl);
	}

}
