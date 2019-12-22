
import java.sql.*;

public class Test {
	public static void main(String[] args){
		String Name;
		String Reg_number;
		System.out.println("DAO------------------------------");
		String sql="select * from passengers,flight where passengers.Booking_id=flight.Booking_id and passengers.Booking_id=3774527;";
		String url="jdbc:mysql://localhost:3306/airline_enquiry";
		String user="root";
		String pass="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps= con.prepareStatement(sql);
			//ps.setString(1, booking_id);
			
				ResultSet rs= ps.executeQuery();	
			
				//System.out.println(e.getMessage());
			System.out.println("Hello");
			while(rs.next())
			{
				Name = rs.getString("Passenger_Name");
				Reg_number = rs.getString("Reg_no");
				System.out.println("Name:"+Name+" "+Reg_number);
			}
			
			/*ar[0] = Name;
			ar[1] = Reg_number;*/
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// return Name;
	}
}
