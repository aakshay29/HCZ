

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import Util.HCZApplicationUtil;
import model.Hczapplication;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=request.getParameter("Nameinput");
	System.out.println("Input name is " +name);
	String address=request.getParameter("Addressinput");
	String email=request.getParameter("Emailinput");
	String password=request.getParameter("inputPassword");
	String jobhistory =request.getParameter("experience"); 
	String degree =request.getParameter("Degree");
	System.out.println("deg name is " +degree);
	String firstreference =request.getParameter("FirstReference");
	String secondreference =request.getParameter("SecondRefrence");
	String veteran =request.getParameter("VetStatus");
	String citizen =request.getParameter("Citizen");
	String DrugAddict =request.getParameter("DrugAddictions");
	String birthday =request.getParameter("Birthday");
	
	
	
	
	Hczapplication app =new Hczapplication();
	Date dt =new Date(Long.parseLong(birthday));
	app.setApplicantname(name);
	app.setAddress(address);
	app.setJobhistory(jobhistory);
	app.setEmpreferences(firstreference);
	app.setEducation(degree);
	app.setBirthday(dt);
	
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
		
		HCZApplicationUtil.update(app);
		System.out.println("record inserted");
	}
 
}
