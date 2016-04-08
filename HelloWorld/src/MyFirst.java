import java.sql.*;
class MyFirst{
	public static void main(String []args) throws ClassNotFoundException{
		     Connection con = null; // connection to the database
	       
	         
	        try {
	            // connects to the database
	        	 Class.forName("com.mysql.jdbc.Driver");
	           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","root");
	           System.out.println("DB Connected!!");
	        }
	        catch(SQLException ex)
	        {
	        	System.out.println(ex);
	        }
	   
		System.out.println("Hi Nitish Sati");
	}
}