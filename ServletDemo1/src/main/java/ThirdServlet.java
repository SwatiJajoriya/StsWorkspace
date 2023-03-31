

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
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
		String num=request.getParameter("num");
		int n=Integer.parseInt(num);
		int count = 0;
		PrintWriter pw=response.getWriter();
		
		for (int i=1;i<=n;i++)
		{
			if(n%i==0) {
				
				count++;
			}
		}
		if(count==2) 
		{
			pw.print(" the entered number "    +(n)+ " is a Prime number ");
			//response.sendRedirect("Success.html");
		}
		else {
			pw.print(" the entered number " +(n)+ " is not a Prime number " );
			//response.sendRedirect("Fail.html");
		}

	}

}
