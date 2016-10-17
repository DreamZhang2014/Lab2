package Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class model_add {
	String writer_name=null;
	Connection connect_temp = DB_connect.connect();
	Connection connect_tempp = DB_connect.connect();
	Connection connect_temppp = DB_connect.connect();
	public String add_start() {
		return "success";
}
	public String getType() {
		return writer_name;
	}
	public void setType(String writer_name) {
		this.writer_name=writer_name;
	}
	public String add() throws SQLException {
		String str[]=null;
		int j=0;
		int i=0;
		str=writer_name.split(",");
		java.sql.PreparedStatement flag = null;
		java.sql.PreparedStatement flag1 = null;
		java.sql.ResultSet re = null;
		java.sql.ResultSet re1 = null;
		flag=connect_tempp.prepareStatement("select ISBN,Title,Publisher,Publishdate,Price from book where Title = ?");
		flag.setString(1, str[1]);
		re1=flag.executeQuery();
		while(re1.next())
		{
			i=1;
		}
		if(i==0)
		{
			
			String sql = "insert into book ( ISBN,Title,AuthorID,Publisher,Publishdate,Price ) value (?,?,?,?,?,?)";
			PreparedStatement pStmt = connect_temp.prepareStatement(sql);
			pStmt.setString(1,str[6]);
			pStmt.setString (2,str[1]);
			pStmt.setString(3,str[2]);
			pStmt.setString (4,str[3]);
			pStmt.setString (5,str[4]);
			pStmt.setString (6,str[5]);
			pStmt.executeUpdate();
		}
		else
			return "fail";
		flag1=connect_tempp.prepareStatement("select AuthorID,Name,Age,Country from author where Name = ?");
		flag1.setString(1, str[0]);
		re=flag1.executeQuery();
		while(re.next())
		{
			j=1;
		}
		if(j==0)
		{
			String sqll = "insert into author ( AuthorID,Name,Age,Country ) value (?,?,?,?)";
			PreparedStatement pStmtt = connect_temppp.prepareStatement(sqll);
			pStmtt.setString(1,str[2]);
			pStmtt.setString (2,str[0]);
			pStmtt.setString(3,str[7]);
			pStmtt.setString (4,str[8]);
			pStmtt.executeUpdate();
		}
		return "success";
}
}
