package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Enquiry;

/**
 * Servlet implementation class Enquirycont
 */
@WebServlet("/Enquirycont")
public class Enquirycont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enquirycont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String depart = request.getParameter("depart");
		String return1 = request.getParameter("return1");
		Enquiry e = new Enquiry(from, to, depart, return1);
		PrintWriter out = response.getWriter();
		//out.print(from);
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" + 
				"\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\r\n" + 
				"\r\n" + 
				"<!-- jQuery library -->\r\n" + 
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n" + 
				"\r\n" + 
				"<!-- Popper JS -->\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>");
		out.println("<link rel=\"stylesheet\" href=\"css/statusDetails_style.css\">");
		out.println("<title>Enquiry Portal</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 class='text-success text-center'>Airline Enquiry System</h1>");
		out.println("<br>");
		out.println("<br>");
		out.println("<h2>Your Enquiry Results</h2>");
		out.println("<br>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/airline_enquiry";
			String user="root";
			String pass="root";
			
			Connection con = DriverManager.getConnection(url, user, pass);

			String sql = "Select * from air where sourcepl='"+from+"' and Destination ='"+ to+"' and Dep_Date='"+depart+"'";
			PreparedStatement ps=con.prepareStatement(sql);
			
			/*String sql1 = "Select * from air where sourcepl='"+from+"' and Destination ='"+ to+"' and Dep_Date='"+return1+"'";
			PreparedStatement ps1=con.prepareStatement(sql1);*/

			ResultSet rs=ps.executeQuery();
			
			//ResultSet rs1=ps1.executeQuery();
			out.println("<h4>Departure Flight Details : </h4>");
			out.println("<br>");
			while(rs.next())
			{
				out.println("<table>");
				out.println("<tr>");
				out.println("<th>");
				out.println("Source");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("sourcepl"));
				out.println("</td>");
				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Destination");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Destination"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.print("Airline");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("AirlineInfo"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Fare");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Price"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Total Duration");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Duration"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Departure Date");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Dep_Date"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Departure Time");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Dep_Time"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Arrival Date");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Arrival_Date"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Arrival Date");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Arrival_Time"));
				out.println("</td>");

				out.println("</tr>");
				
				
				out.println("<tr>");
				out.println("<th>");
				out.println("Meal");
				out.println("</th>");
				
				out.println("<td>");
				out.println(rs.getString("Meal"));
				out.println("</td>");

				out.println("</tr>");
				
				out.println("</table>");
				 
				 
				 
				 
				 
				 
				 
				 
				 


			}
			
			out.println("<br>");
			
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/airline_enquiry";
			String user="root";
			String pass="root";
			
			Connection con1 = DriverManager.getConnection(url, user, pass);

			String sql1 = "Select * from air where sourcepl='"+to+"' and Destination ='"+ from+"' and Dep_Date='"+return1+"'";
			PreparedStatement ps=con1.prepareStatement(sql1);
			
			ResultSet rs1=ps.executeQuery();
			
			out.println("<h4>Return Flight Details : </h4>");
			out.println("<br>");
			while(rs1.next())
			{
					out.println("<table>");
					out.println("<tr>");
					out.println("<th>");
					out.println("Source");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("sourcepl"));
					out.println("</td>");
					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Destination");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Destination"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.print("Airline");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("AirlineInfo"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Fare");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Price"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Total Duration");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Duration"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Departure Date");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Dep_Date"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Departure Time");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Dep_Time"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Arrival Date");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Arrival_Date"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Arrival Date");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Arrival_Time"));
					out.println("</td>");

					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<th>");
					out.println("Meal");
					out.println("</th>");
					
					out.println("<td>");
					out.println(rs1.getString("Meal"));
					out.println("</td>");

					out.println("</tr>");
					
					out.println("</table>");
			}
			
		} catch (Exception e3) {
			// TODO: handle exception
			e3.printStackTrace();
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
