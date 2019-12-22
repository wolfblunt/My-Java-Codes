package dao;
import java.sql.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class JdbcDaoImpl {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public int totalStudents()
	{
		String sql = "Select count(*) from student";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	
	

}
