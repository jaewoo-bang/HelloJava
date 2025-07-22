package 기업회원관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
		public static Connection getConnect() {
			Connection conn = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott" ,"tiger");
		}
			catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
		public static void close(Connection conn) {
			if(conn != null) {
				try {
					conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}			
	}
}