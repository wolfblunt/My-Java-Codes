

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "One", urlPatterns = { "/a" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("t1");
		String password=request.getParameter("t2");
		if(name.equalsIgnoreCase(password))
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:blue'>Welcome "+name+"</h1><br>");
			out.println("</body>");
			out.println("</html>");

		}
		
		else
		{
//			out.println("<html>");
//			out.println("<body>");
//			out.println("<h1 style='color:red'> Wrong Username and Password</h1>");
//			out.println("</body>");
//			out.println("</html>");
			
			RequestDispatcher in=request.getRequestDispatcher("error.html");
			in.forward(request,response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
