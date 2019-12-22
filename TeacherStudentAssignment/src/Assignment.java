import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class Assignment {
static int flag =0;
static Scanner s = new Scanner(System.in);
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int j=200;
			while(j==200) 
			{
				System.out.println("Welcome to Student - Teacher Portal");
				System.out.println("Select your category");
				System.out.println("Select 1 for teacher and 2 for student");
				System.out.println("Select 3 for exit");
				
				System.out.print("Enter your category : ");
				int userChoice = s.nextInt();
				switch(userChoice)
				{
				case 1:
					System.out.println("Welcome to Teacher portal");
					System.out.print("Enter your UserName : ");
					String teacherusername = sc.next();
					System.out.print("Enter your password : ");
					String password = sc.next();
					login(teacherusername,password);
					if(flag>0)
					{
						System.out.println("Welcome "+teacherusername);
						System.out.println("Operations :");
						//System.out.println("Option 1: Press 1 to take attendance");
						int i=100;
						while(i==100) {
						System.out.println("Option 1: Press 1 to see student list");
						System.out.println("Option 2: Press 2 to update attendance of student on the basis of his/her name");
						System.out.println("Option 3: Press 3 to take attendance");
						System.out.println("Option 4: Quit");
						System.out.println("Choose any one operation :");
						int teacherChoice = s.nextInt();
						switch (teacherChoice) {
						case 1:
							System.out.println("Student List");
							allStudentview();
							break;
							
						case 2:
							System.out.println("Welcome to attendance portal : ");
							attendance();
							break;
							
						case 3:
							System.out.println("Take attendance of whole class");
							takeAttendance();
							break;
							
						case 4:
							i =101;
							break;
						default:
							System.out.println("Invalid Entry");
							break;
						}
						
						}
					}
					break;
					
				case 2:
					System.out.println("Operations :");
					int k=300;
					while(k==300) {
						System.out.println("Option 1:View your details");
						System.out.println("Option 2:Exit");
						System.out.print("Enter your choice : ");
						int studentchoice = s.nextInt();
						
						switch (studentchoice) {
						case 1:
							System.out.println("Enter you name : ");
							String studentname = sc.next();
							studentview(studentname);
							break;
							
						case 2:
							k=302;
							break;
			
						default:
							break;
						}
					
					}
					break;
						
				case 3:
					j=201;
					break;
				default:
					System.out.println("Invalid Entry");
				}
			
			}
			
			System.out.println("Thanks for using this portal");
			System.out.println("Program terminated");
		
		
			
	}
	
	
	public static void login(String username,String password)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student_teacher_database";
			String user ="root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url,user, pass);
			if(username!=null && password!=null) {	
				String sql = "Select * from loginpassword where username='"+username +"' and password='"+password+"'";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next())
				{
					flag ++;
				}
				else {
					System.out.println("Invalid username and password");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void attendance()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student_teacher_database";
			String user ="root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url,user, pass);
			String sql = "Update student_database set attendance=? where name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.print("Enter student name : ");
			String name = sc.next();
			System.out.println("Enter attendance(p/a)");
			String attendance = sc.next();
			ps.setString(1, attendance);
			ps.setString(2, name);
			ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void allStudentview()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student_teacher_database";
			String user ="root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url,user, pass);
			String sql = "Select * from student_database";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("Id"+""+"Name"+"  "+"Age"+" "+"Address"+" "+"Attendance");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
			}
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void studentview(String name)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student_teacher_database";
			String user ="root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url,user, pass);
			String sql = "Select * from student_database where name='"+name+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("Id : "+rs.getInt("id"));
				System.out.println("Name : "+rs.getString("name"));
				System.out.println("Age : "+rs.getInt("age"));
				System.out.println("Address : "+rs.getString("address"));
				System.out.println("Attendance : "+rs.getString("attendance"));
			}
			
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void takeAttendance()
	{
		System.out.println("Hello I am OK");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student_teacher_database";
			String user ="root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url,user, pass);
			String sql = "Select * from student_database";
			PreparedStatement ps = con.prepareStatement(sql);
			//System.out.println("I am also fine");
			ResultSet rs = ps.executeQuery();
			//System.out.println("I am also OK");
			
			while(rs.next())
			{
				String name = rs.getString(2);
				System.out.println("Name : "+name);
				System.out.print("Mark his present or absent(p or a) : ");
				String sql1 = "Update student_database set attendance=? where name = ?";
				PreparedStatement ps1 = con.prepareStatement(sql1);
				String attendance = sc.next();
				ps1.setString(1, attendance);
				ps1.setString(2, name);
				ps1.executeUpdate();
				System.out.println("Byee");
			}
			//System.out.println("I am done my work");
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
