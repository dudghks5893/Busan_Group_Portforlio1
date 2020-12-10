package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	private final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private final String USER = "scott";
	private final String PASSWORD = "1234";
	
	Connection conn = null;
	
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			return conn;
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static void main(String[] args) {
		DBConnect connect = new DBConnect();
		Connection conn  = connect.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
        String sql = "SELECT * FROM customer";
		
		
		try {
			stmt = conn.createStatement(); // sql실행준비
			rs = stmt.executeQuery(sql);  //sql 실행 리턴값이 rs 객체로
			
			while(rs.next()) {  //다음 행이 있으면?
				System.out.println(rs.getNString("name"));
				System.out.println(rs.getNString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
