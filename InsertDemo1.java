package dbOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dbConnection.DbConnection;

public class InsertDemo1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		
		con = DbConnection.getConnection();
		try {
			st = con.createStatement();
			int x = st.executeUpdate("insert into employee values(100, 'Sachin', 9999.99, 'sachin123', 'password')");
			System.out.println(x + " Rows inserted.");
			
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
