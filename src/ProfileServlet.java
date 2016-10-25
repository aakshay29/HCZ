

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/oracle/workspace/HCZ/src/Resume.txt");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String skills =request.getParameter("skills");
		String summary = request.getParameter("summary");
		String objective= request.getParameter("objective");
		String bday= request.getParameter("birthday");
		String education =request.getParameter("degree");
		String exp =request.getParameter("experience");
		String reference =request.getParameter("FirstReference");
		String secrefer =request.getParameter("SecondRefrence");
		
		FileWriter filewriter = new FileWriter("/home/oracle/workspace/HCZ/src/UnitTest/Resume.txt", true);
		filewriter.write("Name: "+ name + "\n");
		filewriter.write("Birthday: "+ bday + "\n");
		filewriter.write("Email: "+ email + "\n");
		filewriter.write("Skills: "+ skills + "\n");
		filewriter.write("Summary: "+ summary + "\n");
		filewriter.write("Objective: "+ objective + "\n");
		filewriter.write("Degree: "+ education + "\n");
		filewriter.write("Experience: "+ exp + "\n");
		filewriter.write("Reference: "+ reference + "\n");
		
		
		
		
		
		filewriter.flush();
		filewriter.close();
}
	}

