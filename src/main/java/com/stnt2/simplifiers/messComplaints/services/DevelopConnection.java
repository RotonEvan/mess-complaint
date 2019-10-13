package com.stnt2.simplifiers.messComplaints.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DevelopConnection {
	
	String URL, USER, PASS;
	Connection conn = null;
//	Connection to the respective database will be connected depending on the String passed while the constructor
	public DevelopConnection()
	{
		URL = "jdbc:mysql://remotemysql.com:3306/vaczCbtHZJ";
		USER = "vaczCbtHZJ";
		PASS = "91SvOZLrr9";
	}
	
//	open() is used to open connection to the database selected
	void open() throws ClassNotFoundException, SQLException
	{
		String myDriver = "com.mysql.jdbc.Driver";
	    Class.forName(myDriver);
	    this.conn = DriverManager.getConnection(URL, USER, PASS);
	}
	
//	close() will close the connection to the database
	void close() throws SQLException
	{
		conn.close();
	}

//	prepareStatement() is used to prepare a SQL query statement
	PreparedStatement prepareStatement(String query) throws SQLException
	{
		return conn.prepareStatement(query);
	}
	
//	createStatement() works similar to prepareStatement depending on the places it's used
	Statement createStatement() throws SQLException
	{
		return conn.createStatement();
	}

}
