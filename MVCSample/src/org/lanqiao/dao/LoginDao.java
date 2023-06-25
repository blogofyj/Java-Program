package org.lanqiao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.lanqiao.entity.Login;

//模型层，处理登录(查询数据)
public class LoginDao {
	public static int login(Login login) {
		
//		boolean flag = false;
		int flag = -1;
		int result = -1;
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("导入驱动类");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "root", "root");
			
			String sql = "select count(*) from login where uname = ? and passward = ? " ;
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, login.getUname());
			pstmt.setString(2, login.getUpwd());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
				
			}
			if(result > 0) {
				return 1;
				
			}else {
				return 0;//登录失败，用户名或密码错误
			}
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return -1;//登录失败，系统异常
			
		}catch(SQLException e) {
			e.printStackTrace();
			return -1;
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
			
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(connection != null) connection.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
