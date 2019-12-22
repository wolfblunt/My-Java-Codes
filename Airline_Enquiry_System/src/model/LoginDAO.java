package model;
import java.sql.*;

public class LoginDAO {
	public String Name;
	public String Reg_number;
	public String P_id;
	public String P_dob;
	public String P_sex;
	public String Arr_date;
	public String Arr_time;
	public String Dep_date;
	public String Dep_time;
	public String from_Airport;
	public String to_Airport;
	public String From_Dest123;
	public String To_Dest123;
	public String meal_type;
	public String ar[] = new String[20];
	public String[] check(String booking_id)
	{
		System.out.println("DAO------------------------------");
		int book = Integer.parseInt(booking_id);
		System.out.println(book);
		String sql="Select * from passengers,flight where (flight.Booking_id=passengers.Booking_id and flight.Booking_id="+book+")";
		String url="jdbc:mysql://localhost:3306/airline_enquiry";
		String user="root";
		String pass="root";
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps= con.prepareStatement(sql);
			//ps.setString(1, booking_id);
			
				ResultSet rs= ps.executeQuery();	
				
				/*try {
					String sql1="Select * from flight,airport where (airport.Airport_Code = flight.From_Dest) or (airport.Airport_Code = flight.To_Dest)";
					PreparedStatement ps1=con.prepareStatement(sql);
					//ps.setInt(1, id);
					ResultSet rs1=ps.executeQuery();
				} catch (Exception e) {
					// TODO: handle exception
				}*/
			
			//System.out.println("Hello");
				
				
				
			
			while(rs.next())
			{
				P_id = rs.getString("P_ID");
				Name = rs.getString("Passenger_Name");
				Reg_number = rs.getString("Reg_no");
				P_dob = rs.getString("DOB");
				P_sex = rs.getString("Sex");
				Dep_date = rs.getString("Dep_Date");
				Dep_time = rs.getString("Dep_Time");
				Arr_date = rs.getString("Arrival_Date");
				Arr_time = rs.getString("Arrival_Time");
				From_Dest123 = rs.getString("From_Dest");
				To_Dest123 = rs.getString("To_Dest");
				
			}
			/*int dest = Integer.parseInt(From_Dest123);
			try {
				String sql1="Select * from flight,airport where (airport.Airport_Code = flight.From_Dest "+ "and"+" flight.From_Dest = "+dest+")";
				System.out.println(sql1);
				PreparedStatement ps1=con.prepareStatement(sql1);
				//ps.setInt(1, id);
				ResultSet rs1=ps.executeQuery();
//				Statement st = con.createStatement();
//				ResultSet rs1 = st.executeQuery(sql);
				System.out.println("Hello Aman");
				
				while(rs1.next())
				{

					System.out.println("-----------------------------------------------------");
					System.out.println(rs1.getString(1));
					System.out.println(rs1.getString(2));
					System.out.println(rs1.getString(3));
					System.out.println(rs1.getString(4));
					System.out.println(rs1.getString(5));
					System.out.println(rs1.getString(6));
					System.out.println(rs1.getString(7));
					System.out.println(rs1.getString(8));
					System.out.println(rs1.getString(9));
					System.out.println(rs1.getString(10));
					System.out.println(rs1.getString(11));
					System.out.println(rs1.getString(12));
					System.out.println("-----------------------------------------------------");
					
					Airport = rs1.getString("Airport_Name");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
			
			ar[0] = P_id;
			ar[1] = Name;
			ar[2] =	P_dob;
			ar[3] = P_sex;
			ar[4] = Dep_date;
			ar[5] = Dep_time;
			ar[6] = Arr_date;
			ar[7] = Arr_time;
			ar[8] = From_Dest123;
			ar[9] = To_Dest123;
			
			
			/*return "ID : "+P_id+"\n"+"Name : "+Name+" "+"DOB : "+P_dob+" "+"Sex : "+P_sex+" "+"Departure Date : "+Dep_date+" "+"Departure Time : "
			+Dep_time+" "+"Arrival Date : "+Arr_date+" "+"Arrival Time : "+Arr_time+" "+"Airport Name : "+Airport+" "+" "+"From_Dest : "+From_Dest123 ;
			*/
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return ar;
		
		
	}
	
	public String check1(String fromDest123)
	{
		System.out.println("New DAO");
		String sql="Select * from passengers,flight where passengers.Booking_id=flight.Booking_id";
		String url="jdbc:mysql://localhost:3306/airline_enquiry";
		String user="root";
		String pass="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql1="Select * from flight,airport where (airport.Airport_Code = flight.From_Dest "+ "and"+" flight.From_Dest = '"+fromDest123+"')";
			System.out.println(sql1);
			
			PreparedStatement ps1=con.prepareStatement(sql1);
			//ps.setInt(1, id);
			ResultSet rs1=ps1.executeQuery();
			while(rs1.next())
			{
				from_Airport = rs1.getString("Airport_Name");
			}
		}
			
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(from_Airport);
		return from_Airport;	
	}
	
	public String check2(String toDest123)
	{
		System.out.println("New DAO");
		//String sql="Select * from passengers,flight where passengers.Booking_id=flight.Booking_id";
		String url="jdbc:mysql://localhost:3306/airline_enquiry";
		String user="root";
		String pass="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			String sql2="Select * from flight,airport where (airport.Airport_Code = flight.To_Dest "+ "and"+" flight.To_Dest = '"+toDest123+"')";
			System.out.println(sql2);
			
			PreparedStatement ps2=con.prepareStatement(sql2);
			//ps.setInt(1, id);
			ResultSet rs2=ps2.executeQuery();
			while(rs2.next())
			{
				to_Airport = rs2.getString("Airport_Name");
			}
		}
			
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(to_Airport);
		return to_Airport;	
	}
	
}
