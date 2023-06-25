package packageone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public int login(String name, String pwd) throws FileNotFoundException {
		String URL = null;
		String USERNAEM = null;
		String PWD = null;
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("加载具体的驱动类");
			
			connection = DriverManager.getConnection(URL, USERNAEM, pwd);
			
			String sql = "insert into mymusic vlaues(?,?)";
			
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			
			File file = new File("...");
			InputStream is = new FileInputStream(file);
			pstmt.setBinaryStream(2, is, (int)file.length() );
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("Success");
			}else if(count == 0) {
				System.out.println("Error");
			}else {
				System.out.println("The system error");
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return 1;
	}
}
