package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.LoginDAO;

/**
 * Servlet implementation class Statuscont
 */
@WebServlet("/Statuscont")
public class Statuscont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Statuscont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String booking_id = request.getParameter("booking_no");
		LoginDAO dao = new LoginDAO();
		PrintWriter out = response.getWriter();
		dao.check(booking_id);
		//out.println(dao.ar.length);
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Check Status</title>");
			out.println("<link rel='stylesheet' href='css/source.css'>");
			out.println("</head>");
			out.println("<body>");
			//String cssTag = "<link rel='stylesheet' type='text/css' href='" + cssLocation + "'>";
			out.println("<h1 align='center'>Welcome to airline enquiry system</h1>");
			out.println("<br>");
			//out.println("<h1 align='center'>Your Status</h1>");
			out.println("<br>");
			out.println("<div class='container'>");
			out.println("<table cellpadding='5' cellspacing='10' align='center'>");
			out.println("<tbody>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Name");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[1]);
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("DOB");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[2]);
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Sex");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[3]);
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Departure Date");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[4]);
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Departure Time");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[5]);
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Arrival Date");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[6]);
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Arrival Time");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.ar[7]);
			out.println("</td>");
			out.println("</tr>");
			
			String from_d_code = dao.ar[8];
			String to_d_code = dao.ar[9];
			
			out.println("<tr>");
			out.println("<th>");
			out.println("Source Airport");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.check1(from_d_code));
			out.println("</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Destination Airport");
			out.println("</th>");
			out.println("<td>");
			out.println(dao.check2(to_d_code));
			out.println("</td>");
			out.println("</tr>");
			out.println("</tbody>");
			out.println("</table>");
			out.println("<a href=\"Home_page.jsp\" class = \"text-danger\"><h3 align=\"center\">Exit</h3></a>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		
		//out.println(info.getP_id());
		
		//out.println("Hello AMAN");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
