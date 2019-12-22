import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p1.Student;

/**
 * Servlet implementation class ShowBooks
 */
@WebServlet("/show")
public class ShowBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBooks() {
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
		ServletContext context = getServletContext();
		out.println("<html>");
		out.println("<body>");
		
		List<Student> info;
		info = (ArrayList<Student>) context.getAttribute("list");
		Iterator itr = info.iterator();
		
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>ID</th>");
		out.println("<th>Name</th>");
		out.println("<th>Author</th>");
		out.println("</tr>");
		while(itr.hasNext())
		{
			out.println("<tr>");
			out.println("<td>"+((HttpSession) itr.next()).getId()+"</td>");
			out.println("<td>"+((HttpSession) itr.next()).getName()+"</td>");
			out.println("<td>"+((HttpSession) itr.next()).getAuthor()+"</td>");
			out.println("</tr>");
		
		out.println("</table>");
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
