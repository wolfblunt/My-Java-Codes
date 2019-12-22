

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculate
 */
@WebServlet("/a")
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculate() {
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
		out.println("<html>");
		out.println("<body>");
		String button = request.getParameter("b1");
		int num1 = Integer.parseInt(request.getParameter("t1"));
		int num2 = Integer.parseInt(request.getParameter("t2"));
		if(button.equals("Add"))
		{
			out.println("The Addition of two number is : "+(num1+num2));
		}
		else if(button.equals("Subtract"))
		{
			out.println("The Subtraction of two number is : "+(num1-num2));
		}
		else if(button.equals("Multiply"))
		{
			out.println("The Multiplication of two number is : "+(num1*num2));
		}
		else if(button.equals("Divide"))
		{
			out.println("The Division of two number is : "+(num1/num2));
		}
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
