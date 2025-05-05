package com.firstapp.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sql="INSERT into student values(3,'Pabitra',6371326214)";
		String url="jdbc:postgresql://localhost:5432/school";
		String user="postgres";
		String password="123";
		Class.forName("org.postgresql.Driver");
		Connection con =DriverManager.getConnection(url, user, password);
		Statement st =con.createStatement();
		st.execute(sql);
		
		System.out.println("Data Saved Successfully");
		con.close();
		
	}

}
