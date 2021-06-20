package com.seleniumexpress.lifecycle.annotations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	Connection con;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside the custome init method");
		createStudentDBConnection();
		
	}
	
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException  {
		
		//load Driver
		Class.forName(driver); 
				
		//get a Connection
		 con = DriverManager.getConnection(url,userName,password);
						
	}
	
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		System.out.println("Retriving all Student data...");
		
		//create statement
		Statement stmt = con.createStatement();
		
	    ResultSet rs = stmt.executeQuery("Select * from university.students");
	    
	    while (rs.next()) {
	    	
	    int id = rs.getInt(1);
	    String name = rs.getString(2);
	    String address = rs.getString(3);
	    String age = rs.getString(4);
	    String password = rs.getString(5);
	    int deptId = rs.getInt(6);
	    int friendId = rs.getInt(7);
	    
	    System.out.println(id +" "+ name +"  "+ address +"  "+ age +" "+ password +" "+ deptId +" "+ friendId);
		     	
			
		}
		
		
		
	}
	
	
	public void closeConnection() throws SQLException {
		
		//close the connection
		
		con.close();
	}
	
	public void destroy() throws SQLException {
		
		System.out.println("inside destroy method");
		closeConnection();
	}
	

}
