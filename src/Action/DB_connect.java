package Action;
import java.sql.*;
public class DB_connect {
	public static Connection connect() {
		Connection connect = null;//ָ��
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");//������������
			connect = DriverManager.getConnection(
			"jdbc:mysql://vjberxifiuli.rds.sae.sina.com.cn:10506/bookdb",
			"root","123456");
		//���ݿ���û���������
				/*	connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bookdb", "root","123456");*/
		}
		catch (ClassNotFoundException e) {
			System.out.println("Error!");//δ���ӵ����ݿ�
		}
		catch (Exception e) {
			System.out.println("Error!");//δ���ӵ����ݿ�
		}
		return connect;
	}
}
