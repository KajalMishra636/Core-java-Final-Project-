package com.kajal.Project;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class helperDB {
	    private static final String URL = "jdbc:mysql://localhost:3306/StudentManagementSystem";
	    private static final String USER = "root"; // your MySQL username
	    private static final String PASSWORD = "root"; // your MySQL password

	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("✅ Database connected successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }
	}
