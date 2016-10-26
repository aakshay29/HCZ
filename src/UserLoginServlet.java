

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import UserData.DBUtil;
import Util.HCZEmployeeUtil;
import model.Hczuserprofile;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
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
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nextUrl = "";
		  
		int size =50;
		 String gravatarURL = DBUtil.getGravatarURL("aakshay.29@gmail.com", size);
        session.setAttribute("gravatarURL", gravatarURL);
		Hczuserprofile user = HCZEmployeeUtil.isValidUser(username, password);
		
		if(user != null){
			session.setAttribute("profile", user);
			//String email= user.getEmail();				
		}
		
		nextUrl = "/profileview.jsp";
		response.sendRedirect(request.getContextPath()+nextUrl);
	}

}
