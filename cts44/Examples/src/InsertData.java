

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData  
{

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		String query="insert into staff values  ('hello','879','cse')";
		int count=statement.executeUpdate(query);
	
		System.out.println(count+"record(s) inserted...");
		statement.close();
		connection.close();
		
	}

}
