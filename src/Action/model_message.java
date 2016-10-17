package Action;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class model_message extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String str;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {//зЊТы
		/*byte tByte[] = null;
		try {
			tByte = str.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		try {
			str = new String(tByte,"gb2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/
		this.str=str;
	}
	public String message() throws SQLException {
		java.sql.PreparedStatement flag = null;
		java.sql.PreparedStatement flag2 = null;
		java.sql.ResultSet re = null;
		java.sql.ResultSet re2 = null;
		String str_0=null;
		String authorid=null,name=null,age=null,country=null;
		DB_connect p = new DB_connect();
		Connection connect_temp =p.connect();
		book_table e_temp=new book_table();
		try {
			flag=connect_temp.prepareStatement("select AuthorID,Name,Age,Country from author where Name = ?");
			flag.setString(1, str);
			
			re=flag.executeQuery();
			while(re.next()){
			str_0=re.getString(1);
			authorid=re.getString(1);
			name=re.getString(2);
			age=re.getString(3);
			country=re.getString(4);
			}
			flag2 = connect_temp.prepareStatement("select ISBN,Title,Publisher,Publishdate,Price from book where AuthorID ="+str_0);
			re2 = flag2.executeQuery();

			while (re2.next()) {
				e_temp.authorid=authorid;
				e_temp.name=name;
				e_temp.age=age;
				e_temp.country=country;
				e_temp.isbn=re2.getString(1);
				e_temp.title=re2.getString(2);
				e_temp.publisher=re2.getString(3);
				e_temp.publishdate=re2.getString(4);
				e_temp.price=re2.getString(5);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		ActionContext.getContext().put("b1",e_temp.isbn);
		ActionContext.getContext().put("b2",e_temp.title);
		ActionContext.getContext().put("b3",e_temp.authorid);
		ActionContext.getContext().put("b4",e_temp.publisher);
		ActionContext.getContext().put("b5",e_temp.publishdate);
		ActionContext.getContext().put("b6",e_temp.price);
		ActionContext.getContext().put("b7",e_temp.name);
		ActionContext.getContext().put("b8",e_temp.age);
		ActionContext.getContext().put("b9",e_temp.country);
		return "success";
	}
}
