

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
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
		
		//the data from the form always comes as a  String 
				String num1=request.getParameter("num1");
				String num2=request.getParameter("num2");
				int n1=Integer.parseInt(num1);
				int n2=Integer.parseInt(num2);
				//virtual page-response
				PrintWriter pw=response.getWriter();
				response.setContentType("text/html");
				pw.print("the output is "+(n1+n2));
				pw.print("<html>"
						+ "<body>"
						+ "<h1>the output is" +(n1+n2)+ "</h1>"
						+ "</body>"
					    + "</html>");

	}

}
