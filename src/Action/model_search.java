package Action;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import Action.book_table;

public class model_search extends ActionSupport{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String writer_name;
	
	public String getType() {
		return writer_name;
	}
	public void setType(String writer_name) {
		this.writer_name=writer_name;
	}
	public String search_name() throws SQLException {
			if(result(writer_name).isEmpty())
				return "wrong";
			else
			{
				ActionContext.getContext().put("bl", result(writer_name).get(0).title);
				ActionContext.getContext().put("b0", result(writer_name).get(0).name);
				return "OK";
			}
				
	}
	public String re_turn() {
		return "back";
}
	public ArrayList <book_table> result(String writer_name) throws SQLException{
		ArrayList <book_table> ele= new ArrayList <book_table>();
		java.sql.PreparedStatement flag = null;
		java.sql.PreparedStatement flag2 = null;
		java.sql.ResultSet re = null;
		java.sql.ResultSet re2 = null;
		String str=null;
		String authorid=null,name=null,age=null,country=null;
		DB_connect p = new DB_connect();
		Connection connect_temp =p.connect();
		try {
			flag=connect_temp.prepareStatement("select AuthorID,Name,Age,Country from author where Name = ?");
			flag.setString(1, writer_name);
			
			re=flag.executeQuery();
			while(re.next()){
			str=re.getString(1);
			authorid=re.getString(1);
			name=re.getString(2);
			age=re.getString(3);
			country=re.getString(4);
			}
			flag2 = connect_temp.prepareStatement("select ISBN,Title,Publisher,Publishdate,Price from book where AuthorID ="+str);
			re2 = flag2.executeQuery();
			
			while (re2.next()) {
				book_table e_temp=new book_table();
				e_temp.authorid=authorid;
				e_temp.name=name;
				e_temp.age=age;
				e_temp.country=country;
				e_temp.isbn=re2.getString(1);
				e_temp.title=re2.getString(2);
				e_temp.publisher=re2.getString(3);
				e_temp.publishdate=re2.getString(4);
				e_temp.price=re2.getString(5);
				ele.add(e_temp);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return ele;
		}
}
		


