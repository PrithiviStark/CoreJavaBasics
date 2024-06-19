package javalearn.jdbc;

import java.sql.*;

public class LearnJDBC {

	public static void main(String[] args) throws Exception {
		
		String query ="select * from User_data";
		
		String dburl ="jdbc:sqlserver://DESKTOP-OJK016Q\\LOCALHOST;databaseName=MYDB;encrypt=true;trustServerCertificate=true;";
		String user ="TestUser";
		String password ="root";
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
//		Connection con = DriverManager.getConnection(dburl,user,password);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
		
		ResultSet rs = DriverManager.getConnection(dburl,user,password).createStatement().executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
	}

}
