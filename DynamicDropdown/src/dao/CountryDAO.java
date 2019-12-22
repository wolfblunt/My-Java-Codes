package dao;
import java.sql.*;
import java.util.*;
import java.io.*;
import core.Country;
import core.Country;
public class CountryDAO {
	Connection con = null;
	public CountryDAO() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/countries";
		String user="root";
		String pass="root";
		con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connection Established");
	}
	
	/*public List<Country> getAllCountries() throws Exception{
		List<Country> list = new ArrayList<>();
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = con.createStatement();
			myRs = myStmt.executeQuery("select * from employees");
			
			
			
			while (myRs.next()) {
				Country tempCountry = convertRowToEmployee(myRs);
				list.add(tempCountry);
			}

			return list;		
		}
		finally {
			close(myStmt, myRs);
		}
	}
*/	
	public ArrayList<String> printCountry() throws SQLException{
		Statement myStmt = null;
		ResultSet myRs = null;
		ArrayList<String> countr = new ArrayList<>();
		try {
			myStmt = con.createStatement();
			myRs = myStmt.executeQuery("select * from country");
		
		while (myRs.next()) {
			
			countr.add(myRs.getString(2));
		}
		}
		finally {
			close(myStmt, myRs);
		}
		return(countr);
		 
	}
	
	private Country convertRowToEmployee(ResultSet myRs) throws SQLException{
		int id = myRs.getInt("id");
		String country = myRs.getString("country");
		Country testCountry = new Country(id, country);
		//String c = testCountry.toString();
		return testCountry;
	}
	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
			throws SQLException {

		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}
	
	private void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);		
	}
	}
	