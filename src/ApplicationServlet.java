

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HCZApplicationStatusUtil;
import Util.HCZApplicationUtil;
import Util.HCZJobUtil;
import model.Hczapplication;
import model.Hczapplicationstatus;
import model.Hczjob;

/**
 * Servlet implementation class ApplicationServlet
 */
@WebServlet("/ApplicationServlet")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
		
	HttpSession session = request.getSession();
		
	String jobid= request.getParameter("jobid");
	
	String name=request.getParameter("Nameinput");
	String address=request.getParameter("Addressinput");
	String jobhistory =request.getParameter("experience"); 
	String degree =request.getParameter("Degree");
	String skills =request.getParameter("skills");
	String firstreference =request.getParameter("FirstReference");
	String secondreference =request.getParameter("SecondRefrence");

	String veteran =request.getParameter("VetStatus");
	String citizen =request.getParameter("Citizen");
	String DrugAddict =request.getParameter("DrugAddictions");
	String birthday =request.getParameter("Birthday");
	
	Hczjob hczjob = HCZJobUtil.getJob(Float.parseFloat(jobid));
	
	Hczapplication app =new Hczapplication();
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	Date dt;
	try {
		dt =   formatter.parse(birthday);
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		System.out.println("The date is " + sqlDate);
	
		app.setApplicantname(name);
		app.setAddress(address);
		app.setJobhistory(jobhistory);
		app.setEmpreferences(firstreference + "," + secondreference);
		app.setEducation(degree);
		app.setBirthday(sqlDate);
		app.setHczjob(hczjob);
		app.setSkills(skills);
		if(veteran.equalsIgnoreCase("yes")) {
			app.setVeteran(1);
		}
		else {
			app.setVeteran(0);
		}
			
		if (citizen.equalsIgnoreCase("yes")){
			app.setCitizen(1);
		}
		else {
			app.setCitizen(0);
		}
			
		if(DrugAddict.equalsIgnoreCase("yes")){
			app.setDruguser(1);
		}
		else {
			app.setCitizen(0);
		}
		
		HCZApplicationUtil.insert(app);
		System.out.println("record inserted");
		int appid= (int) app.getApplicationid();
		
		
		Hczapplication newapp = HCZApplicationUtil.getApplication(appid);
		session.setAttribute("applicationId",appid);
		Hczapplicationstatus stat= new Hczapplicationstatus();
		stat.setHczapplication(newapp);
		stat.setAlcoholtest(2);
		stat.setCodingtest(2);
		stat.setDottest(2);
		stat.setVeteran(2);
		stat.setGroupinterview(2);
		stat.setWorkhistory(2);
		stat.setEducationdegree(2);
		stat.setHrinterview(2);
		stat.setManagerinterview(2);
		stat.setNationality(2);
		stat.setStandardpaneltest(2);
		stat.setStatus("In process");
		
		HCZApplicationStatusUtil.insert(stat);
		System.out.println("Record inserted in status table");
		long status= stat.getStatusid();
		session.setAttribute("Status", status);
		
		String nextURL="/applicationConfirmation.jsp";
		response.sendRedirect(request.getContextPath() + nextURL);	
		
		
	} catch (java.text.ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
