package Action;
import java.sql.*;
public class DB_connect {
	public static Connection connect() {
		Connection connect = null;//指针
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			connect = DriverManager.getConnection(
			"jdbc:mysql://vjberxifiuli.rds.sae.sina.com.cn:10506/bookdb",
			"root","123456");
		//数据库的用户名和密码
				/*	connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bookdb", "root","123456");*/
		}
		catch (ClassNotFoundException e) {
			System.out.println("Error!");//未连接到数据库
		}
		catch (Exception e) {
			System.out.println("Error!");//未连接到数据库
		}
		return connect;
	}
}
