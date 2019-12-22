

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class One
 */
@WebServlet("/a")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public One() {
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
		
		try {
			String button = request.getParameter("b1");
			if (button.equals("Insert")) {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/test";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				int id=Integer.parseInt(request.getParameter("t1"));
				String name=request.getParameter("t2");
				int age=Integer.parseInt(request.getParameter("t3"));
				PreparedStatement ps=con.prepareStatement("Insert into student4 values(?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				ps.executeUpdate();
				out.println("Record Inserted");
			} else if (button.equals("Insert")) {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/test";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				int id=Integer.parseInt(request.getParameter("t1"));
				String name=request.getParameter("t2");
				int age=Integer.parseInt(request.getParameter("t3"));
				PreparedStatement ps=con.prepareStatement("Insert into student4 values(?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				ps.executeUpdate();
				out.println("Record Inserted");
			} else if (button.equals("Update")) {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/test";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				int id=Integer.parseInt(request.getParameter("t1"));
				int age=Integer.parseInt(request.getParameter("t3"));
				PreparedStatement ps=con.prepareStatement("Update student4 set age=? where id=?");
				ps.setInt(1, age);
				ps.setInt(2, id);
				ps.executeUpdate();
				out.println("Record Updated");
			} else if (button.equals("Delete")) {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/test";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				int id=Integer.parseInt(request.getParameter("t1"));
				PreparedStatement ps=con.prepareStatement("Delete from student4 where id=?");
				ps.setInt(1, id);
				ps.executeUpdate();
				out.println("Record Deleted");
			} else if (button.equals("Select")) {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/test";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				int id=Integer.parseInt(request.getParameter("t1"));
				PreparedStatement ps=con.prepareStatement("Select * from student4 where id=?");
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
					out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+"<br>");
			} else if (button.equals("SelectAll")) {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/test";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				PreparedStatement ps=con.prepareStatement("Select * from student4");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
					out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+"<br>");
			} 
		} catch (Exception ex) {
			out.println(ex);
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
