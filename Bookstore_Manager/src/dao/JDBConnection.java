package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnection {
	public Connection conn;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public JDBConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/library_project";
		String id = "root";
		String pw = "0000";
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("Library DB 연결에 성공했습니다.");
		} catch (SQLException e) {
			System.out.println("Library DB 연결에 실패했습니다.");
		}
	}
}

