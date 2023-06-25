package org.lanqiao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBUtil {
	
	/*
	 * Connection connection = null; PreparedStatement pstmt = null;
	 * 
	 * //通用的增删改 public boolean deleteStudentBySno(int sno) { try {
	 * Class.forName(""); connection = DriverManager.getConnection("url", "uname",
	 * "upwd");
	 * 
	 * // Statement stmt = connection.createStatement(); String sql =
	 * "select * from student where sno = ?"; pstmt =
	 * connection.prepareStatement(sql);
	 * 
	 * pstmt.setInt(1, sno); int count = pstmt.executeUpdate();
	 * 
	 * if(count > 0) return true; else return false;
	 * 
	 * }catch(ClassNotFoundException e) { e.printStackTrace(); return false;
	 * }catch(SQLException e) { e.printStackTrace(); return false; }catch(Exception
	 * e) { e.printStackTrace(); return false; } finally { try { if(pstmt != null )
	 * pstmt.close(); if(connection != null) connection.close(); }catch(SQLException
	 * e) { e.printStackTrace(); } } }
	 */
	
	public boolean executeUpdate(String sql, Object[] params) {
		PreparedStatement pstmt = null;
		Connection connection = null;
		
		try {
			Class.forName("");
			connection = DriverManager.getConnection("url", "name", "pwd");
			//Objects[] obs = {name, age, sno.....}
			//String sql = "update student set name = ?, age = ?, sno = ? ..where x = ?";
			
			for(int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
 			int count = pstmt.executeUpdate();
 			
 			if(count > 0)
 				return true;
 			else
 				return false;;
 				
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				if(pstmt != null ) pstmt.close();
				if(connection != null) connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//通用的查, 返回值是一个集合
	public List<Student> queryAllStudents()
	
}
