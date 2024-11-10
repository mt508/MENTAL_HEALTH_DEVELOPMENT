package com.mentalhealththerapy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[]args) throws ClassNotFoundException , SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MentalHealth","root","1824");
		System.out.println("Connection Created");
	}
}
