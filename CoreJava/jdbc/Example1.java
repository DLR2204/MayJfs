package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		(1)Loading the driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Create the connnection
		
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Rakesh","sai");
		
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
//		(4)Exceute our queries
		
		stmt.execute("create table January(eid number(10),ename varchar2(10))");
//		(5)close the connections
		
		conn.close();
		
		System.out.println("table is created successfully");
	}

}
