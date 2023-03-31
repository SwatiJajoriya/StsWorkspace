

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveController
 */
public class RetriveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveController() {
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
		StudentDAO dao=new StudentDAO();
		
		PrintWriter pw=response.getWriter();
		
		try {
			response.setContentType("text/html");
			List<Student> list=dao.getall();
			pw.println("<html><body><table border='1'><tr><td>Name</td><td>Email</td><td>Password</td><td>Phono</td></tr>");
			for(Student s:list) {	
pw.println("<tr><td>"+s.getName()+"</td><td>"+s.getEmail()+"</td><td>"+s.getPassword()+"</td><td>"+s.getPhono()+"</td></tr>");
		
			}
			pw.println("</table></body></html>");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


