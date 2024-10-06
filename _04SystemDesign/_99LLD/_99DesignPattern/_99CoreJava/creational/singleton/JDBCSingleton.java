package _41DesignPattern.coreJava.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
	
	private static JDBCSingleton jDBCSingleton = new JDBCSingleton();

	private JDBCSingleton() {

	}

	public static JDBCSingleton getInstance() {
		return jDBCSingleton;
	}

	public void view(String ename) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = this.getConnection();
			ps = con.prepareStatement("select * from employees where ename=?");
			ps.setString(1, ename);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Name= " + rs.getString(2) + "\t" + "Address= " + rs.getString(4));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
		return con;
	}

}
