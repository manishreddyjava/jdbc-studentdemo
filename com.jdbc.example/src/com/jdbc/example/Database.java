package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Database {
	private final static String DB_URL="jdbc:mysql://localhost:3306/Jdbc?serverTimezone=UTC";
	private final static String DB_USERNAME="root";
	private final static String DB_PASSWORD="Patkuri96";
	
	private final static String LOADING_CLASS="com.mysql.cj.jdbc.Driver";
	
	
	public static ResultSet getResultSet(Connection connection,Statement statement,String dbQuery){
		ResultSet resultSet = null;
		try{
			resultSet =statement.executeQuery(dbQuery);
		}catch(Exception e){
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static Connection getConnection(){
		Connection connection = null;
		try{
			Class.forName(LOADING_CLASS).newInstance();
			connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println("Successfully acquired the database connection");
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}

	
	
	public static void closeConnection( Connection connection ) {
		if ( connection != null ) {
			try {
				System.out.println("closing connection");
				connection.close();
			} catch ( SQLException e ) {
				System.out.println(e.getMessage());
			} finally {
				connection = null;
			}
		}
	}
	
	public static void closeResultSet( ResultSet resultSet ) {
		try {
			if ( resultSet != null ) {
				System.out.println("closing resultset");
				resultSet.close();
			}
		} catch ( SQLException sqlException ) {
			System.out.println(sqlException.getMessage());
		} finally {
			resultSet = null;
		}
	}
	
	public static void closeStatement( Statement statement ) {
		if ( statement != null ) {
			try {
				System.out.println("closing statement");
				statement.close();
			} catch ( SQLException e ) {
				System.out.println("SQLException " + e.getMessage());
			} finally {
				statement = null;
			}
		}
	}
	
	public static void closePreparedStatement( PreparedStatement pstatement ) {
		if ( pstatement != null ) {
			try {
				System.out.println("closing pstatement");
				pstatement.close();
			} catch ( SQLException e ) {
				System.out.println("SQLException " + e.getMessage());
			} finally {
				pstatement = null;
			}
		}
	}
	
	

}
