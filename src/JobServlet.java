

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.HCZEmployeeUtil;
import Util.HCZJobUtil;
import model.Hczjob;
import model.Hczuserprofile;

/**
 * Servlet implementation class JobServlet
 */
@WebServlet("/JobServlet")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
	
		
		String nextURL=null;
		
		List <Hczjob> jobs =HCZJobUtil.getJobs();
		session.setAttribute("jobs",jobs);
		
		if(request.getParameter("user") != null) {
		System.out.println("i am here");
		String user=request.getParameter("user");
		Hczuserprofile profile = HCZEmployeeUtil.getprofile(Long.parseLong(user));
		session.setAttribute("user", profile);
		}
		
		nextURL="/job.jsp";
		response.sendRedirect(request.getContextPath() + nextURL);	
		
	}

}
