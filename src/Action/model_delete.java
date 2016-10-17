package Action;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

public class model_delete {
	public String str_new;
	
	public String getStr_new() {
		return str_new;
	}
	public void setStr_new(String str_new) {//зЊТы
		/*byte tByte[] = null;
		try {
			tByte = str_new.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		try {
			str_new = new String(tByte,"gb2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/
		this.str_new=str_new;
	}
	public void delete_book(String str) throws SQLException {
		
		//Connection connect_tempt = DB_connect.connect();
		DB_connect p = new DB_connect();
		Connection connect_tempt =p.connect();
		java.sql.PreparedStatement sqll = null;
		sqll=connect_tempt.prepareStatement("delete from book where Title = ?");
		sqll.setString(1,str);
		sqll.executeUpdate();
	}
	public String delete() throws SQLException{
		delete_book(str_new);
		return "success";
	}
}
