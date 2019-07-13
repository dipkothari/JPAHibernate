package com.login.LoginCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LoginCreation {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deep","root","Kothari_1");
			Statement st = con.createStatement();
			
			st.executeUpdate("insert into customer value ('22','deep')");
		
			con.close();
		}
		catch(Exception e) {
			System.out.println("Exception Occured"+e);
		}
		
	}
}
