

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class first
 */
@WebServlet(name = "One", urlPatterns = { "/abc" })
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		String name=request.getParameter("t1");
		String address=request.getParameter("t2");
		String city=request.getParameter("t3");
		String gender=request.getParameter("t4");
		String v="";
		String vehicle[]=request.getParameterValues("t5");
		int i;
		out.println("Name : "+name+"<br>");
		out.println("Address : "+address+"<br>");
		out.println("City : "+city+"<br>");
		out.println("Gender : "+gender+"<br>");
		out.println("Selected Vehicle :");
		for(i=0;i<vehicle.length;i++)
		{
			v=vehicle[i];
			out.println(v+"<br>");
		}
//		out.println("");
		out.println("</body>");
		out.println("</html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
