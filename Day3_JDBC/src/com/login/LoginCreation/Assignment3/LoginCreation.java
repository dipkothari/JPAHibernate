package com.login.LoginCreation.Assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class LoginCreation {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deep","root","Kothari_1");
			PreparedStatement ps = con.prepareStatement("select * from customer");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				 
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
				
			
			
		
			
		}
		catch(Exception e) {
			System.out.println("Exception Occured"+e);
		}
		
	}
}
