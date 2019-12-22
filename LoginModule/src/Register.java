

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int flag=0;
		String name=request.getParameter("t1");
		String username=request.getParameter("t2");
		String password=request.getParameter("p1");
		String repassword=request.getParameter("p2");
		
		PrintWriter out =response.getWriter();
		
		if(password.equals(repassword))
		{
			SignUpDAO signup = new SignUpDAO();
			
			if(signup.insertRecord(username, password))
			{
				response.sendRedirect("signupsuccess.jsp");
			}
			
			else
			{
				response.sendRedirect("signUp.jsp");
			}
		}
		
		else {
			response.sendRedirect("signUp.jsp");
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
