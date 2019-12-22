

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p1.Student;

/**
 * Servlet implementation class AddBooks
 */
@WebServlet("/add")
public class AddBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBooks() {
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
		
		List<Student> list = new ArrayList<Student>();
		
		/*while(context.getAttribute("list")!=null)
		{
			List<Student> list_old = (List)context.getAttribute("list");
			Iterator itr=list_old.iterator();
			
			while(itr.hasNext())
			{
				Student st=new Student();
				st=(Student)itr.next();
				list.add(st);
			}	
		}*/
		
		String id = request.getParameter("t1");
		String name = request.getParameter("t2");
		String author = request.getParameter("t3");
		list.add(new Student(id, name, author));
		
		//out.println("I am addBooks");
		RequestDispatcher view = request.getRequestDispatcher("index.html");
		view.forward(request, response);
		context.setAttribute("list", list);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
