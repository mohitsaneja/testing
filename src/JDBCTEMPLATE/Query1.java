package JDBCTEMPLATE;
import org.springframework.jdbc.core.JdbcTemplate;
public class Query1 {
	JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	/*
	 * public int saveEmployee(table_class e){ String query
	 * ="insert into employee values( '"+e.getId()+"','"+e.getName()+"','"+e.
	 * getSalary()+"')"; return jdbctemplate.update(query); } public int
	 * updateEmployee(table_class e){ String
	 * query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()
	 * +"' where id='"+e.getId()+"' "; return jdbctemplate.update(query); } public
	 * int deleteEmployee(table_class e){ String
	 * query="delete from employee where id='"+e.getId()+"' "; return
	 * jdbctemplate.update(query); }
	 */
}
