package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
	static Connection con = null;
	static Statement st;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_management", "root", "root");
			System.out.println("Connected");

			st = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {

	}
	
	public static Statement getStatement() {
		return st;
	}

	public static Connection getConnection() {
		return con;
	}
}
