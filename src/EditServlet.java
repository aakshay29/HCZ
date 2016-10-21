

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HCZApplicationUtil;
import model.Hczapplication;
import model.Hczapplicationstatus;
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
		HttpSession session = request.getSession();
		String nextUrl = "";
		Hczuser user = (Hczuser) session.getAttribute("user");
		int applicationID = Integer.parseInt(request.getParameter("applicationID"));	
		Hczapplication application = HCZApplicationUtil.getApplication(applicationID);
		Hczapplicationstatus applicationStatus = application.getHczapplicationstatuses().get(0);
		session.setAttribute("applicationStatus", applicationStatus);
		long role = user.getUserrole();
		if(role == 1){//HR Manager - HR Interview, 
			nextUrl = "/editApplication.jsp";
		}
		if(role == 2){//HR Specialist - Degrees
			nextUrl = "/editApplication.jsp";
		}
		if(role == 3){//HR Assistant - History, Reference, Veteran
			nextUrl = "/editApplication.jsp";
		}
		if(role == 4){//Health Care Professional - Drug
			nextUrl = "/editApplication.jsp";
		}
		if(role == 5){//Compliance Officer - Nationality
			nextUrl = "/editApplication.jsp";
		}
		if(role == 6){//Hiring Manager - Second Interview
			nextUrl = "/editApplication.jsp";
		}
		response.sendRedirect(request.getContextPath()+nextUrl);
	}
}
